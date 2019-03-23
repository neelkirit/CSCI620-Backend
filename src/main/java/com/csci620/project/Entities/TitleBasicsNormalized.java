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
import java.io.Serializable;

@Entity
@Table(name = "title_basics_normalized")
public class TitleBasicsNormalized implements Serializable {

    @Id
    @Column(name = "tconst", unique = true, nullable = false)
    private String tconst;

    @Column(name = "title_type")
    private String titleType;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private int endYear;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "primary_title")
    private String primaryTitle;

    @Column(name = "is_adult")
    private int isAdult;

    @Column(name = "runtime_minutes")
    private int runtimeMinutes;

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

    public int getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(int isAdult) {
        this.isAdult = isAdult;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }
}
