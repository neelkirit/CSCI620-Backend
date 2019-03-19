package com.csci620.project.Entities;

/*
 * NameTitles.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "name_titles")
public class NameTitles implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nconst", unique = true, nullable = false)
    private NameBasicsNormalized nameBasicsNormalized;

    @Column(name = "titles")
    private String titles;

    public NameBasicsNormalized getNameBasicsNormalized() {
        return nameBasicsNormalized;
    }

    public void setNameBasicsNormalized(NameBasicsNormalized nameBasicsNormalized) {
        this.nameBasicsNormalized = nameBasicsNormalized;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
