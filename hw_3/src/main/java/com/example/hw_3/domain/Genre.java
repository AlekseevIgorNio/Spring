package com.example.hw_3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genre {
    private int id;
    private int lvl;
    private Integer parentId;
    private String name;
    private String slug;
    private Genre parent;
    private List<Genre> child;

    public void addGenreChild(Genre genre){
        if (child == null){
            child = new ArrayList<>();
        }
        child.add(genre);
    }
}
