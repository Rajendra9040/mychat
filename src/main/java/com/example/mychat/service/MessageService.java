package com.example.mychat.service;

import com.example.mychat.model.Message;
import com.example.mychat.model.User;
import com.example.mychat.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public Message sendMessage(User sender, User receiver, String content) {
        Message message = new Message(sender, receiver, content, LocalDateTime.now());
        return messageRepository.save(message);
    }

    public List<Message> getMessagesBySender(Long senderId) {
        return messageRepository.findBySenderId(senderId);
    }

    public List<Message> getMessagesByReceiver(Long receiverId) {
        return messageRepository.findByReceiverId(receiverId);
    }
}
