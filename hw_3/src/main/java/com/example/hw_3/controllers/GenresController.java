package com.example.hw_3.controllers;

import com.example.hw_3.domain.Genre;
import com.example.hw_3.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.example.hw_3.controllers.BookController.MAIN_URL_BOOKSHOP;

@Controller
@RequiredArgsConstructor
@RequestMapping(MAIN_URL_BOOKSHOP + "/genres")
public class GenresController {

    private final GenreService genreService;

    @ModelAttribute("allGenres")
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping()
    public String getAllGenresPage() {
        return "genres/genres";
    }

    @GetMapping("/genre/{id}")
    public String getGenrePage(Model model, @PathVariable Integer id) {
        model.addAttribute("genres", genreService.getGenreById(id));
        return "genres/genre";
    }
}