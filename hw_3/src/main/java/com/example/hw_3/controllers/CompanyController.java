package com.example.hw_3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.hw_3.controllers.BookController.MAIN_URL_BOOKSHOP;

@Controller
@RequestMapping(MAIN_URL_BOOKSHOP)
public class CompanyController {

    @GetMapping("/documents")
    public String getDocumentsPage(){
        return "company/documents";
    }

    @GetMapping("/about")
    public String getAboutPage(){
        return "company/about";
    }

    @GetMapping("/faq")
    public String getFaqPage(){
        return "company/faq";
    }

    @GetMapping("/contacts")
    public String getContactsPage(){
        return "company/contacts";
    }
}
