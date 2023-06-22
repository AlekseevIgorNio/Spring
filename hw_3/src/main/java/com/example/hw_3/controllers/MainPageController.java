package com.example.hw_3.controllers;

import com.example.hw_3.service.AuthorService;
import com.example.hw_3.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bookshop")
public class MainPageController {

    private final BookService bookService;
    private final AuthorService authorService;

    @GetMapping("/main")
    public String getMainPage(Model model){
        model.addAttribute("books", bookService.getAllBook());
        return "index";
    }

    @GetMapping("/authors")
    public String getAuthorsPage(Model model){
        model.addAttribute("firstLetterFirstnames", authorService.getDistinctFirstLetterOfFirstname());
        model.addAttribute("mapWithFirstLetterAndArrayOfAuthors", authorService.getMapWithFirstLetterAndArrayOfAuthors());
        return "authors";
    }

    @GetMapping("/genres")
    public String getGenresPage(){
        return "genres";
    }
}
