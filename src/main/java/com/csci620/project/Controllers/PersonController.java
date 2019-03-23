package com.csci620.project.Controllers;

import com.csci620.project.Beans.Person;
import com.csci620.project.Entities.NameBasicsNormalized;
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
    ArrayList<NameBasicsNormalized> fetchAll(@RequestBody Person person) {
        return personService.fetchAll();
    }

    @RequestMapping(value = "/fetchByName", method = RequestMethod.POST,
            consumes =
                    "application/json")
    public @ResponseBody
    ArrayList<NameBasicsNormalized> fetchByName(@RequestBody Person person) {
        return personService.fetchByName(person);
    }

    @RequestMapping(value = "/fetchBySingleProfession")
    ArrayList<NameBasicsNormalized> fetchBySingleProfession(@RequestBody Person person) {
        return null;
    }
}
