package com.example.webhook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.webhook.model.MessageRequest;
import com.example.webhook.service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        // Log incoming message
        System.out.println("Message from " + request.getSender() + ": " + request.getMessage());

        // Generate reply
        String reply = chatService.getReply(request.getMessage());

        return reply;
    }
}