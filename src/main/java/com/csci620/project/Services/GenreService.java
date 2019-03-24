package com.csci620.project.Services;

/*
 * GenreService.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Beans.Genre;
import com.csci620.project.Modals.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GenreService {

    @Autowired
    GenreRepository genreRepository;

    public ArrayList<com.csci620.project.Entities.Genre> fetchAll() {
        return (ArrayList<com.csci620.project.Entities.Genre>) genreRepository.findAll();
    }

    public ArrayList<Genre> findByGenre(Genre genre) {
        return mapObjectToGenre(genreRepository.findByGenre(genre.getName(),
                genre.getStartLimit(), genre.getEndLimit()));
    }

    public ArrayList<Genre> findByTopRating(String genre, int startLimit,
                                            int endLimit) {
        return mapObjectToGenre(genreRepository.findByTopRating(genre,
                startLimit, endLimit));
    }

    private ArrayList<Genre> mapObjectToGenre(ArrayList<Object[]> genreRatings) {
        ArrayList<Genre> genreArrayList = new ArrayList<>();
        for (Object[] genreRating : genreRatings) {
            Genre genre = new Genre();
            genre.setName((String) genreRating[0]);
            genre.setAverageRating((float) genreRating[1]);
            genreArrayList.add(genre);
        }
        return genreArrayList;
    }

}
