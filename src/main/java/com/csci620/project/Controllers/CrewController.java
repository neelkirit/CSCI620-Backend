package com.csci620.project.Controllers;

/*
 * CrewController.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import com.csci620.project.Entities.TitleCrew;
import com.csci620.project.Services.CrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
