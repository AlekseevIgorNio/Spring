package com.example.hw_3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.hw_3.controllers.BookController.MAIN_URL_BOOKSHOP;

@Controller
@RequestMapping(MAIN_URL_BOOKSHOP)
public class UserController {

    @GetMapping("/cart")
    public String getCartPage(){
        return "user/cart";
    }

    @GetMapping("postponed")
    public String getPostponedPage(){
        return "user/postponed";
    }
}
