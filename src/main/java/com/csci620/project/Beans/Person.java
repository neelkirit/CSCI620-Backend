package com.csci620.project.Beans;

public class Person {
    private String name;
    private String profession;
    private Integer count;
    private String rating;
    private int startLimit;
    private int endLimit;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getStartLimit() {
        return startLimit;
    }

    public void setStartLimit(int startLimit) {
        this.startLimit = startLimit;
    }

    public int getEndLimit() {
        return endLimit;
    }

    public void setEndLimit(int endLimit) {
        this.endLimit = endLimit;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", count=" + count +
                ", rating=" + rating +
                '}';
    }
}
