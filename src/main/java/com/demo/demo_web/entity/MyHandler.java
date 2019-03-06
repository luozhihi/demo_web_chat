package com.demo.demo_web.entity;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Service
public class MyHandler implements WebSocketHandler {

    //  在线用户列表
    private static final Map<String, WebSocketSession> userList;
    private Logger logger = LoggerFactory.getLogger(MyHandler.class);

    static {
        userList = new HashMap<>();
    }

    //    新增socket连接的回调函数
    //   todo 可以用来将离线消息发送给用户，离线消息存到数据库，用户与服务器建立连接之后将离线消息推送给用户
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("成功建立连接");
        String[] msg = session.getUri().toString().split("/");
        String ID = msg[msg.length - 1];
        ID = URLDecoder.decode(ID,"UTF-8");
        logger.info(ID);
        if (ID != null) {
            userList.put(ID, session);
            sendMessageToAllUsers(new TextMessage("["+ID + "]:"+"上线了"));
            logger.info(ID);
            logger.info(session.toString());
        }
        logger.info("当前在线人数：" + userList.size());
    }

    //接收socket信息，接收客户端发送的socket
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
        try {
            JSONObject jsonobject = JSONObject.parseObject(webSocketMessage.getPayload().toString());
            logger.info(jsonobject.get("id").toString());
            logger.info(jsonobject.get("message") + ":来自" + webSocketSession.getAttributes().get("WEBSOCKET_USERID") + "的消息");
            sendMessageToAllUsers(new TextMessage(jsonobject.get("id").toString() + ":" + jsonobject.get("message").toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 发送信息给指定用户
     *
     * @param clientId
     * @param message
     * @return
     */
    public boolean sendMessageToUser(String clientId, TextMessage message) {
        logger.info(userList.toString());
        logger.info("发送消息到" + clientId);
        if (userList.get(clientId) == null) {
            logger.info("[用户不存在]");
            return false;
        }
        WebSocketSession session = userList.get(clientId);
        logger.info("sendMessage:" + session);
        if (!session.isOpen()) return false;
        try {
            session.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 广播信息
     *
     * @param message
     * @return
     */
    public boolean sendMessageToAllUsers(TextMessage message) {
        boolean allSendSuccess = true;
        Set<String> clientIds = userList.keySet();
        WebSocketSession session = null;
        for (String clientId : clientIds) {
            try {
                session = userList.get(clientId);
                if (session.isOpen()) {
                    session.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
                allSendSuccess = false;
            }
        }

        return allSendSuccess;
    }


    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        logger.info("连接出错");
        userList.remove(getClientId(session));
    }

    // 关闭连接的回调
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("连接已关闭：" + status);
        String id = getClientId(session);
        logger.info(id);
        userList.remove(id);
        logger.info("[当前在线人数：" + userList.size() + "]");
        sendMessageToAllUsers(new TextMessage("["+id + "]:"+"下线了"));
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 获取用户标识
     *
     * @param session
     * @return
     */
    private String getClientId(WebSocketSession session) {
        try {
            String clientId = (String) session.getAttributes().get("WEBSOCKET_USERID");
            return clientId;
        } catch (Exception e) {
            return null;
        }
    }
}