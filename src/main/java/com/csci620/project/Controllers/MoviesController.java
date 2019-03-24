package com.csci620.project.Controllers;

import com.csci620.project.Beans.Movie;
import com.csci620.project.Entities.TitleAkas;
import com.csci620.project.Entities.TitleBasicsNormalized;
import com.csci620.project.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/*
 * FetchFromMoviesController.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@RestController
@RequestMapping(value = "/movies")
public class MoviesController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody
    ArrayList<TitleBasicsNormalized> fetchAll() {
        return movieService.fetchAll();
    }

    @RequestMapping(value = "/findByMostVoted", method = RequestMethod.POST,
            consumes = "application/json")
    public @ResponseBody
    ArrayList<TitleBasicsNormalized> findByMostVoted(@RequestBody Movie movie) {
        return movieService.fetchByMostVoted(movie);
    }

    @RequestMapping(value = "/fetchByTitle", method = RequestMethod.POST,
            consumes = "application/json")
    public @ResponseBody
    ArrayList<TitleBasicsNormalized> fetchByTitle(@RequestBody Movie movie) {
        return movieService.fetchByTitle(movie);
    }

    @RequestMapping(value = "/fetchByTitleWithAkas", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<TitleAkas> fetchByTitleWithAkas(@RequestBody Movie movie) {
        return movieService.fetchByTitleWithAkas(movie);
    }

    @RequestMapping(value = "/findByPerson", method = RequestMethod.POST,
            consumes = "application/json")
    public @ResponseBody
    ArrayList<TitleBasicsNormalized> findByPerson(@RequestBody Movie movie) {
        return movieService.fetchByPerson(movie.getPersonList().get(0).getName(),
                movie.getPersonList().get(0).getProfession(),
                movie.getStartLimit(),
                movie.getEndLimit());
    }



}
