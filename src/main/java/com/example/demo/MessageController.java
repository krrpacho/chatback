package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React frontend
public class MessageController {

    @Autowired
    private MessageService messageService;

    // Fetch all messages
    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    // Save a new message
    // @PostMapping
    // public Message saveMessage(@RequestBody Message message) {
    //     return messageService.saveMessage(message);
    // }

    @PostMapping
    public Message saveMessage(@RequestBody Message message) {
        System.out.println("Received message: " + message.getContent());
        return messageService.saveMessage(message);
    }   


    // Delete a message
    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);
    }

    // Update an existing message
    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message updatedMessage) {
        return messageService.updateMessage(id, updatedMessage);
    }
}
