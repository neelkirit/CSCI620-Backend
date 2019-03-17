package com.csci620.project.Services;

import com.csci620.project.Beans.MovieQuery;
import com.csci620.project.Entities.TitleAkas;
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

    public ArrayList<TitleBasics> fetchByTitle(MovieQuery movieQuery) {
        return titleBasicRepository.findByPrimaryTitle(movieQuery.getName());
    }

    public ArrayList<TitleAkas> fetchByTitleWithAkas(MovieQuery movieQuery) {
        return titleBasicRepository.findByPrimaryTitleWithAkas(movieQuery.getName(), movieQuery.getLanguage());
    }

    public ArrayList<TitleBasics> fetchAll() {
        return (ArrayList<TitleBasics>) titleBasicRepository.findAll();
    }
}
