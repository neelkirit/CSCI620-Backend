package com.csci620.project.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/*
 * TitleCrew.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Entity
@Table(name = "title_crew")
public class TitleCrew implements Serializable {

    @Id
    @Column(name = "tconst", unique = true, nullable = false)
    private String tconst;

    @Column(name = "directors")
    private String directors;

    @Column(name = "writers")
    private String writers;

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }
}
