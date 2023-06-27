package com.example.hw_3.dao.impl;

import com.example.hw_3.dao.GenreDao;
import com.example.hw_3.dao.mappers.BookMapper;
import com.example.hw_3.dao.mappers.GenreMapper;
import com.example.hw_3.domain.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreDaoJdbcImpl implements GenreDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> getAllGenres() {
        String sql = "SELECT * FROM genre";
        return jdbcTemplate.query(sql, new GenreMapper());
    }

    @Override
    public Genre getGenreById(int id) {
        String sql = "SELECT * FROM genre WHERE id = :id";
        return jdbcTemplate.queryForObject(sql, new MapSqlParameterSource("id",id), new GenreMapper());
    }
}
