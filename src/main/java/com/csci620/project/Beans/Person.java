package com.csci620.project.Beans;

public class Person {
    private String name;
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
