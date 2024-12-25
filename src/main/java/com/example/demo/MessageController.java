package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")

@CrossOrigin(origins = "https://krrpacho.github.io")
//@CrossOrigin(origins = "http://localhost:3000") 
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping
    public Message saveMessage(@RequestBody Message message) {
        System.out.println("Received message: " + message.getContent());
        return messageService.saveMessage(message);
    }   

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);
    }

    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message updatedMessage) {
        return messageService.updateMessage(id, updatedMessage);
    }
}
