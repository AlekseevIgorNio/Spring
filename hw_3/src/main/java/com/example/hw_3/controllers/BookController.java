package com.example.hw_3.controllers;

import com.example.hw_3.domain.Book;
import com.example.hw_3.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(BookController.MAIN_URL_BOOKSHOP)
public class BookController {

    public static final String MAIN_URL_BOOKSHOP = "/bookshop";
    private final BookService bookService;

    @ModelAttribute("books")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/main")
    public String getMainPage() {
        return "index";
    }

    @GetMapping("/slug")
    public String getMainPage1() {
        return "books/slug";
    }

    @GetMapping("/slugmy")
    public String getMainPage2() {
        return "books/slugmy";
    }

    @GetMapping("/book/{id}")
    public String getBookPage() {
        return "index";
    }

    @GetMapping("/books/recent")
    public String getBooksRecentPage() {
        return "books/recent";
    }

    @GetMapping("/books/popular")
    public String getBooksPopularPage() {
        return "books/popular";
    }
}