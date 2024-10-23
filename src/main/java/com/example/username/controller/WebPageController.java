package com.example.username.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {

    @GetMapping("/webpage")
    public String showWebPage() {
        return "index"; // This corresponds to index.html in the templates folder
    }
}
