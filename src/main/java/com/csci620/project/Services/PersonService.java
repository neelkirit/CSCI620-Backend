package com.csci620.project.Services;

import com.csci620.project.Beans.PersonQuery;
import com.csci620.project.Entities.NameBasics;
import com.csci620.project.Modals.NameBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    @Autowired
    NameBasicRepository nameBasicRepository;

    public ArrayList<NameBasics> fetchByName(PersonQuery personQuery) {
        return nameBasicRepository.findByPrimaryName(personQuery.getName());
    }

    public ArrayList<NameBasics> fetchAll() {
        return (ArrayList<NameBasics>) nameBasicRepository.findAll();
    }
}
