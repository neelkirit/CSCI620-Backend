package com.csci620.project.Beans;

import java.util.ArrayList;

/*
 * Movie.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public class Movie {
    private String name;
    private String language;
    private ArrayList<Person> personList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", personList=" + personList.toString() +
                '}';
    }
}
