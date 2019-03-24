package com.csci620.project.Controllers;

/*
 * GenreController.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Beans.Genre;
import com.csci620.project.Services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/genre")
public class GenreController {

    @Autowired
    GenreService genreService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody
    ArrayList<com.csci620.project.Entities.Genre> fetchAll() {
        return genreService.fetchAll();
    }

    @RequestMapping(value = "/findByGenre", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<com.csci620.project.Entities.Genre> findByGenre(@RequestBody Genre genre) {
        return genreService.findByGenre(genre);
    }

    @RequestMapping(value = "/findByTopRating", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<Genre> findByTopRating(@RequestBody Genre genre) {
        return genreService.findByTopRating(genre.getName(),
                genre.getStartLimit(), genre.getEndLimit());
    }
}
