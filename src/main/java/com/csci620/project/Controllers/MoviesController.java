package com.csci620.project.Controllers;

import com.csci620.project.Beans.Movie;
import com.csci620.project.Beans.MovieQuery;
import com.csci620.project.Entities.TitleBasics;
import com.csci620.project.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    ArrayList<TitleBasics> fetchAll() {
        return movieService.fetchAll();
    }

    @RequestMapping(value = "/fetchByTitle", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public Movie fetchByTitle(MovieQuery movieQuery) {


        return null;
    }
}
