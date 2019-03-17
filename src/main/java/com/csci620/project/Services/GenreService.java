package com.csci620.project.Services;

/*
 * GenreService.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Entities.Genre;
import com.csci620.project.Modals.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GenreService {

    @Autowired
    GenreRepository genreRepository;

    public ArrayList<Genre> fetchAll() {
        return (ArrayList<Genre>) genreRepository.findAll();
    }

}
