package com.example.username.controller;

import com.example.username.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatController {

    private List<Message> messages = new ArrayList<>();

    @GetMapping("/chat")
    public String getChatPage(Model model) {
        model.addAttribute("messages", messages); // Pass the messages list to the view
        return "chat";  // Return the Thymeleaf template "chat.html"
    }

    @PostMapping("/send-message")
    public String sendMessage(@RequestParam String sender, @RequestParam String content) {
        messages.add(new Message(sender, content)); // Add the new message to the list
        return "redirect:/chat";  // Redirect to the chat page to show the updated messages
    }
}
