package com.example.hw_3.controllers;

import com.example.hw_3.domain.Author;
import com.example.hw_3.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

import static com.example.hw_3.controllers.BookController.MAIN_URL_BOOKSHOP;

@Controller
@RequiredArgsConstructor
@RequestMapping(MAIN_URL_BOOKSHOP + "/authors")
public class AuthorController {

    private final AuthorService authorService;

    @ModelAttribute("mapWithFirstLetterAndArrayOfAuthors")
    public Map<String, List<Author>> getMapWithFirstLetterAndArrayOfAuthors() {
        return authorService.getMapWithFirstLetterAndArrayOfAuthors();
    }

    @GetMapping()
    public String getAllAuthorsPage() {
        return "authors/authors";
    }

    @GetMapping("/author/{id}")
    public String getAuthorPage(Model model, @PathVariable Integer id) {
        model.addAttribute("author", authorService.getAuthorById(id));
        return "authors/author";
    }
}