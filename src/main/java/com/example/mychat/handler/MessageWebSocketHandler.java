package com.example.mychat.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MessageWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // Handle the message received by WebSocket
        String content = message.getPayload();
        // You can send this content to a specific user or broadcast it to others
        try {
            session.sendMessage(new TextMessage("New message received: " + content));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
