package com.csci620.project.Services;

import com.csci620.project.Beans.Movie;
import com.csci620.project.Beans.MovieQuery;
import com.csci620.project.Entities.TitleBasics;
import com.csci620.project.Modals.TitleBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/*
 * MovieService.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

@Service
public class MovieService {

    @Autowired
    TitleBasicRepository titleBasicRepository;

    public Movie fetchByTitle(MovieQuery movieQuery) {

        return null;
    }

    public ArrayList<TitleBasics> fetchAll() {
//        ArrayList<TitleBasics> movieList = new ArrayList<TitleBasics>();
//        int itr = 0;
//        for (TitleBasics titles: titleBasicRepository.findAll())
//            movieList.add(itr++,titles);


        return (ArrayList<TitleBasics>) titleBasicRepository.findAll();
    }
}
