package com.csci620.project.Services;

import com.csci620.project.Beans.Person;
import com.csci620.project.Entities.NameBasicsNormalized;
import com.csci620.project.Modals.NameBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    @Autowired
    NameBasicRepository nameBasicRepository;

    public ArrayList<NameBasicsNormalized> fetchByName(Person person) {
        return nameBasicRepository.findByPrimaryName(person.getName());
    }

    public ArrayList<NameBasicsNormalized> fetchAll() {
        return (ArrayList<NameBasicsNormalized>) nameBasicRepository.findAll();
    }

    public ArrayList<NameBasicRepository> fetchBySingleProfession(Person person) {
        return null;
    }
}
