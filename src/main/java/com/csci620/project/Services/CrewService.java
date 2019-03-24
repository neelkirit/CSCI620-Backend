package com.csci620.project.Services;

import com.csci620.project.Beans.CrewDetails;
import com.csci620.project.Beans.CrewMovieCount;
import com.csci620.project.Beans.CrewRatings;
import com.csci620.project.Entities.TitleCrew;
import com.csci620.project.Modals.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;

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

    public ArrayList<CrewDetails> fetchByProfession(String name,
                                                    String category,
                                                    int startLimit, int endLimit) {
        return mapObjectToCrewDetails(crewRepository.findByProfession(name,
                category, startLimit, endLimit));
    }

    public ArrayList<CrewMovieCount> fetchByNumOfMovies(String name,
                                                        String category,
                                                        int count,
                                                        int startLimit,
                                                        int endLimit) {
        return mapObjectToCrewMovieCount(crewRepository.findByNumOfMovies(name,
                category, count, startLimit, endLimit));
    }

    public ArrayList<CrewRatings> fetchByCrewRatings(String name, int ratingLow,
                                                     int ratingHigh,
                                                     int startLimit,
                                                     int endLimit) {
        return mapObjectToCrewRatings(crewRepository.findByCrewRatings(name,
                ratingLow, ratingHigh, startLimit, endLimit));
    }

    private ArrayList<CrewMovieCount> mapObjectToCrewMovieCount(ArrayList<Object[]> crewByNumOfMovies) {
        ArrayList<CrewMovieCount> crewMovieCountArrayList = new ArrayList<>();
        for (Object[] crewByMovie : crewByNumOfMovies) {
            CrewMovieCount crewMovieCount = new CrewMovieCount();
            crewMovieCount.setPrimaryName((String) crewByMovie[0]);
            crewMovieCount.setCount((BigInteger) crewByMovie[1]);
            crewMovieCountArrayList.add(crewMovieCount);
        }
        return crewMovieCountArrayList;
    }

    private ArrayList<CrewRatings> mapObjectToCrewRatings(ArrayList<Object[]> titleCrewList) {
        ArrayList<CrewRatings> crewRatingsArrayList = new ArrayList<>();

        for (Object[] titleCrew : titleCrewList) {
            CrewRatings crewRatings = new CrewRatings();
            crewRatings.setPrimaryName((String) titleCrew[0]);
            crewRatings.setPrimaryTitle((String) titleCrew[1]);
            crewRatings.setAverageRating((float) titleCrew[2]);
            crewRatingsArrayList.add(crewRatings);
        }
        return crewRatingsArrayList;
    }

    private ArrayList<CrewDetails> mapObjectToCrewDetails(ArrayList<Object[]> titleCrewList) {
        ArrayList<CrewDetails> crewDetailsArrayList = new ArrayList<>();

        for (Object[] titleCrew : titleCrewList) {
            CrewDetails crewDetails = new CrewDetails();
            crewDetails.setPrimaryName((String) titleCrew[0]);
            crewDetails.setPrimaryTitle((String) titleCrew[1]);
            crewDetails.setTconst((String) titleCrew[2]);
            crewDetails.setOrdering((int) titleCrew[3]);
            crewDetails.setNconst((String) titleCrew[4]);
            crewDetails.setCategory((String) titleCrew[5]);
            crewDetails.setJob((String) titleCrew[6]);
            crewDetails.setCharacters((String) titleCrew[7]);
            crewDetailsArrayList.add(crewDetails);
        }
        return crewDetailsArrayList;
    }
}
