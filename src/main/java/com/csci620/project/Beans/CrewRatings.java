package com.csci620.project.Beans;

/*
 * CrewRatings.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public class CrewRatings {

    private String primaryName;

    private String primaryTitle;

    private float averageRating;

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }


    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }
}
