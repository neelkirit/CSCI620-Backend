package com.csci620.project.Beans;

public class Genre {
    private String name;
    private float averageRating;
    private int startLimit;
    private int endLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
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
}
