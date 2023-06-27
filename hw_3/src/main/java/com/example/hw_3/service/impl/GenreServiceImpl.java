package com.example.hw_3.service.impl;

import com.example.hw_3.dao.GenreDao;
import com.example.hw_3.domain.Genre;
import com.example.hw_3.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreDao genreDao;

    @Override
    public List<Genre> getAllGenres() {
        Map<Integer, List<Genre>> collect = genreDao.getAllGenres()
                .stream()
                .collect(Collectors.groupingBy(Genre::getLvl));
        for (int i = 0; i < collect.size() - 1; i++) {
            collect.get(i).forEach(genre -> collect.get(genre.getLvl() + 1)
                    .stream()
                    .filter(genreChild -> genreChild.getParentId().equals(genre.getId()))
                    .forEach(genre::addGenreChild));
        }

        return collect.get(0);
    }

    @Override
    public Genre getGenreById(int id) {
        Genre genre = genreDao.getGenreById(id);
        if (genre.getParentId() != null) {
            genre.setParent(getGenreById(genre.getParentId()));
        }
        return genre;
    }
}
