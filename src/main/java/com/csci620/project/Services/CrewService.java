package com.csci620.project.Services;

import com.csci620.project.Entities.TitleCrew;
import com.csci620.project.Modals.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * CrewService.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Service
public class CrewService {
    @Autowired
    CrewRepository crewRepository;

    public ArrayList<TitleCrew> fetchAll() {
        return (ArrayList<TitleCrew>) crewRepository.findAll();
    }

    public ArrayList<Object[]> fetchByProfession(String name, String category) {
        ArrayList<Object[]> titleCrewList = crewRepository.findByProfession(name, category);
        return titleCrewList;
    }

    public ArrayList<Object[]> fetchByNumOfMovies(String name, String category, Integer cnt) {
        ArrayList<Object[]> titleCrewList = crewRepository.findByNumOfMovies(name, category, cnt);
        return titleCrewList;
    }

    public ArrayList<Object[]> fetchByCrewRatings(String name, Integer start, Integer end) {
        ArrayList<Object[]> titleCrewList = crewRepository.findByCrewRatings(name, start, end);
        return titleCrewList;
    }
}
