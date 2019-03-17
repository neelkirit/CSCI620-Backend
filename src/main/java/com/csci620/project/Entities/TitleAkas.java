package com.csci620.project.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * TitleAkas.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Entity
@Table(name = "title_akas")
public class TitleAkas {

    @Id
    @Column(name = "title_id", unique = true, nullable = false)
    private String titleId;

    @Column(name = "ordering")
    private String ordering;

    @Column(name = "title")
    private String title;

    @Column(name = "region")
    private String region;

    @Column(name = "language")
    private String language;

    @Column(name = "attributes")
    private String attributes;

    @Column(name = "is_original_title")
    private String isOriginalTitle;

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getIsOriginalTitle() {
        return isOriginalTitle;
    }

    public void setIsOriginalTitle(String isOriginalTitle) {
        this.isOriginalTitle = isOriginalTitle;
    }
}
