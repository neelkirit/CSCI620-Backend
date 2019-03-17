package com.csci620.project.Beans;

public class PersonQuery {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonQuery{" +
                "name='" + name + '\'' +
                '}';
    }
}
