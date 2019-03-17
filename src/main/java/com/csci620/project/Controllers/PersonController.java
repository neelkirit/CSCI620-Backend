package com.csci620.project.Controllers;

import com.csci620.project.Beans.PersonQuery;
import com.csci620.project.Entities.NameBasics;
import com.csci620.project.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody
    ArrayList<NameBasics> fetchAll(@RequestBody PersonQuery personQuery) {
        return personService.fetchAll();
    }

    @RequestMapping(value = "/fetchByName", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<NameBasics> fetchByName(@RequestBody PersonQuery personQuery) {
        return personService.fetchByName(personQuery);
    }
}
