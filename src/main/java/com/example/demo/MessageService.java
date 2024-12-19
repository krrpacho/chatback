package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    // Fetch all messages
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
    

    // Save a new message
    // public Message saveMessage(Message message) {
    //     message.setCreatedAt(LocalDateTime.now());
    //     return messageRepository.save(message);
    // }
    public Message saveMessage(Message message) {
        System.out.println("Saving message: " + message);
        message.setCreatedAt(LocalDateTime.now());
        return messageRepository.save(message);
    }
    

    // Delete a message
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }

    // Update a message
    public Message updateMessage(Long id, Message updatedMessage) {
        Message existingMessage = messageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found"));
        existingMessage.setContent(updatedMessage.getContent());
        return messageRepository.save(existingMessage);
    }
}
