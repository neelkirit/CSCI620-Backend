package com.csci620.project.Entities;

/*
 * TitleBasicsNormalized.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title_basics_normalized")
public class TitleBasicsNormalized {

    @Id
    @Column(name = "tconst", unique = true, nullable = false)
    private String tconst;

    @Column(name = "title_type")
    private String titleType;

    @Column(name = "start_year")
    private String startYear;

    @Column(name = "end_year")
    private int endYear;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "primary_title")
    private String primaryTitle;

    @Column(name = "is_adult")
    private String isAdult;

    @Column(name = "runtime_minutes")
    private String runtimeMinutes;

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

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(String isAdult) {
        this.isAdult = isAdult;
    }

    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(String runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }
}
