package com.example.hw_3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getBookPage() {
        return "redirect:/bookshop/main";
    }
}