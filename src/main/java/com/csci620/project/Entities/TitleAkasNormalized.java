package com.csci620.project.Entities;

/*
 * TitleAkasNormalized.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "title_akas_normalized")
public class TitleAkasNormalized implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "title_id", nullable = false)
    private TitleBasics titleBasics;

    @Id
    @Column(name = "ordering", nullable = false)
    private int ordering;

    @Column(name = "title")
    private String title;

    @Column(name = "types")
    private String types;

    @Column(name = "attributes")
    private String attributes;

    @Column(name = "is_original_title")
    private String isOriginalTitle;

    public TitleBasics getTitleBasics() {
        return titleBasics;
    }

    public void setTitleBasics(TitleBasics titleBasics) {
        this.titleBasics = titleBasics;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
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
