package com.example.webhook.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public String webhook(@RequestBody Map<String, String> body) {
        String message = body.get("message");

        if (message == null) return "Invalid";

        switch (message.toLowerCase()) {
            case "hi":
                return "Hello ";
            case "bye":
                return "Goodbye ";
            default:
                return "Unknown message ";
        }
    }
}