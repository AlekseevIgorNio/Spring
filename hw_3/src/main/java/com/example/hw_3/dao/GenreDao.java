package com.example.hw_3.dao;

import com.example.hw_3.domain.Genre;

import java.util.List;

public interface GenreDao {

    List<Genre> getAllGenres();

    Genre getGenreById(int id);
}
