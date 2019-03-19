package com.csci620.project.Services;

import com.csci620.project.Entities.TitleCrew;
import com.csci620.project.Modals.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/*
 * CrewService.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Service
public class CrewService {
    @Autowired
    CrewRepository crewRepository;

    public ArrayList<TitleCrew> fetchAll() {
        return (ArrayList<TitleCrew>) crewRepository.findAll();
    }
}
