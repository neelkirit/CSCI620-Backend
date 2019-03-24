package com.csci620.project.Controllers;

/*
 * CrewController.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Beans.CrewDetails;
import com.csci620.project.Beans.CrewMovieCount;
import com.csci620.project.Beans.CrewRatings;
import com.csci620.project.Beans.Person;
import com.csci620.project.Entities.TitleCrew;
import com.csci620.project.Services.CrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/crew")
public class CrewController {
    @Autowired
    CrewService crewService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody
    ArrayList<TitleCrew> fetchAll() {
        return crewService.fetchAll();
    }

    @RequestMapping(value = "/fetchByProfession", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<CrewDetails> fetchByTitle(@RequestBody Person person) {
        return crewService.fetchByProfession(person.getName(),
                person.getProfession(), person.getStartLimit(),
                person.getEndLimit());
    }

    @RequestMapping(value = "/fetchByNumOfMovies", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<CrewMovieCount> findByNumOfMovies(@RequestBody Person person) {
        return crewService.fetchByNumOfMovies(person.getName(),
                person.getProfession(), person.getCount(),
                person.getStartLimit(), person.getEndLimit());
    }

    @RequestMapping(value = "/fetchByCrewRatings", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<CrewRatings> findByCrewRatings(@RequestBody Person person) {
        String[] rating = person.getRating().split("-");
        return crewService.fetchByCrewRatings(person.getName(),
                Integer.parseInt(rating[0]), Integer.parseInt(rating[1]),
                person.getStartLimit(),
                person.getEndLimit());
    }

}
