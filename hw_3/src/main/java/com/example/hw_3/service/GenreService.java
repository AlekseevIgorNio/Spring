package com.example.hw_3.service;

import com.example.hw_3.domain.Genre;

import java.util.List;

public interface GenreService {

    List<Genre> getAllGenres();

    Genre getGenreById(int id);
}
