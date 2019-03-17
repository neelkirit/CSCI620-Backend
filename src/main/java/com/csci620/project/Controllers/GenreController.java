package com.csci620.project.Controllers;

/*
 * GenreController.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Entities.Genre;
import com.csci620.project.Services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/genre")
public class GenreController {

    @Autowired
    GenreService genreService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody
    ArrayList<Genre> fetchAll() {
        return genreService.fetchAll();
    }
}
