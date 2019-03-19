package com.csci620.project.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "name_basics")
public class NameBasics {

    @Id
    @Column(name = "nconst", unique = true, nullable = false)
    private String nconst;

    @Column(name = "primary_name")
    private String primaryName;

    @Column(name = "birth_year")
    private int birthYear;

    @Column(name = "death_year")
    private int deathYear;

    @Column(name = "primary_profession")
    private String primaryProfession;

    @Column(name = "known_for_titles")
    private String knownForTitles;

    public String getNconst() {
        return nconst;
    }

    public void setNconst(String nconst) {
        this.nconst = nconst;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    public String getPrimaryProfession() {
        return primaryProfession;
    }

    public void setPrimaryProfession(String primaryProfession) {
        this.primaryProfession = primaryProfession;
    }

    public String getKnownForTitles() {
        return knownForTitles;
    }

    public void setKnownForTitles(String knownForTitles) {
        this.knownForTitles = knownForTitles;
    }
}
