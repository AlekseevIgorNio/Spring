package com.example.hw_3.service.impl;

import com.example.hw_3.dao.AuthorDao;
import com.example.hw_3.domain.Author;
import com.example.hw_3.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    @Override
    public List<String> getDistinctFirstLetterOfFirstname() {
        return authorDao.getDistinctFirstLetterOfFirstname();
    }

    @Override
    public Map<String, List<Author>> getMapWithFirstLetterAndArrayOfAuthors() {
        Map<String, List<Author>> map = new HashMap<>();
        authorDao.getAllAuthors().forEach(author -> {
            map.computeIfPresent(author.getFirstname().substring(0, 1), (a,b) -> {
                b.add(author);
                return b;
            });
            map.computeIfAbsent(author.getFirstname().substring(0, 1), b -> new ArrayList<>(List.of(author)));
        });
        return map;
    }
}
