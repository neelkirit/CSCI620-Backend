package com.csci620.project.Services;

import com.csci620.project.Beans.Movie;
import com.csci620.project.Entities.TitleAkas;
import com.csci620.project.Entities.TitleBasicsNormalized;
import com.csci620.project.Modals.TitleBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<TitleBasicsNormalized> fetchByTitle(Movie movie) {
        return titleBasicRepository.findByPrimaryTitle(movie.getName());
    }

    public ArrayList<TitleAkas> fetchByTitleWithAkas(Movie movie) {
        return titleBasicRepository.findByPrimaryTitleWithAkas(movie.getName(), movie.getLanguage());
    }

    public ArrayList<TitleBasicsNormalized> fetchAll() {
        return (ArrayList<TitleBasicsNormalized>) titleBasicRepository.findAll();
    }

    public ArrayList<TitleBasicsNormalized> fetchByPerson(String name,
                                                          String profession,
                                                          int startLimit,
                                                          int endLimit) {
        return mapObjectToTitleBasicsNormalized(
                titleBasicRepository.findByPerson(name, profession,
                        startLimit, endLimit));
    }

    public ArrayList<TitleBasicsNormalized> fetchByMostVoted(Movie movie) {
        return mapObjectToTitleBasicsNormalized(
                titleBasicRepository.findByMostVoted(movie.getStartLimit(),
                        movie.getEndLimit()));
    }


    private ArrayList<TitleBasicsNormalized> mapObjectToTitleBasicsNormalized(List<Object[]> titlesList) {
        ArrayList<TitleBasicsNormalized> titleBasicsNormalizedArrayList =
                new ArrayList<>();

        for (Object[] title : titlesList) {
            TitleBasicsNormalized titleBasicsNormalized = new TitleBasicsNormalized();
            titleBasicsNormalized.setTconst((String) title[0]);
            titleBasicsNormalized.setOriginalTitle((String) title[1]);
            titleBasicsNormalized.setPrimaryTitle((String) title[2]);
            titleBasicsNormalized.setStartYear((int) title[3]);
            titleBasicsNormalized.setEndYear((int) title[4]);
            titleBasicsNormalized.setRuntimeMinutes((int) title[5]);
            titleBasicsNormalized.setIsAdult((int) title[6]);
            titleBasicsNormalized.setTitleType((String) title[7]);
            titleBasicsNormalizedArrayList.add(titleBasicsNormalized);
        }
        return titleBasicsNormalizedArrayList;
    }
}
