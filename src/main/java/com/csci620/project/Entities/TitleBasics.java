package com.csci620.project.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * TitleBasics.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Entity
@Table(name = "title_basics")
public class TitleBasics {

    @Id
    @Column(name = "tconst", unique = true, nullable = false)
    private String tconst;

    @Column(name = "title_type")
    private String titleType;

    @Column(name = "primary_title")
    private String primaryTitle;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "is_adult")
    private Boolean isAdult;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private int endYear;

    @Column(name = "runtime_minutes")
    private String runtimeMinutes;

    @Column(name = "genres")
    private String genres;

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Boolean getAdult() {
        return isAdult;
    }

    public void setAdult(Boolean adult) {
        isAdult = adult;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(String runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
