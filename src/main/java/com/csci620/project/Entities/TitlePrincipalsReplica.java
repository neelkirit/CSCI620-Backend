package com.csci620.project.Entities;

/*
 * TitlePrincipalsReplica.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "title_principals_replica")
public class TitlePrincipalsReplica implements Serializable {

    @Id
    @Column(name = "tconst")
    private String tconst;

    @Id
    @Column(name = "ordering")
    private int ordering;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nconst")
    private NameBasicsNormalized nameBasicsNormalized;

    @Column(name = "category")
    private String category;

    @Column(name = "job")
    private String job;

    @Column(name = "characters")
    private String characters;

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public NameBasicsNormalized getNameBasicsNormalized() {
        return nameBasicsNormalized;
    }

    public void setNameBasicsNormalized(NameBasicsNormalized nameBasicsNormalized) {
        this.nameBasicsNormalized = nameBasicsNormalized;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }
}
