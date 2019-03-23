package com.csci620.project.Entities;

/*
 * TitleRatings.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "title_ratings")
public class TitleRatings implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tconst", unique = true, nullable = false)
    private TitleBasicsNormalized titleBasicsNormalized;

    @Column(name = "average_rating")
    private double averageRating;

    @Column(name = "num_votes")
    private int numVotes;

    public TitleBasicsNormalized getTitleBasicsNormalized() {
        return titleBasicsNormalized;
    }

    public void setTitleBasicsNormalized(TitleBasicsNormalized titleBasicsNormalized) {
        this.titleBasicsNormalized = titleBasicsNormalized;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }
}
