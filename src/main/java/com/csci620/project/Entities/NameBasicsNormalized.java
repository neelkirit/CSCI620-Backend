package com.csci620.project.Entities;

/*
 * NameBasicsNormalized.java
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
@Table(name = "name_basics_normalized")
public class NameBasicsNormalized implements Serializable {

    @Id
    @Column(name = "nconst", unique = true, nullable = false)
    private String nconst;

    @Column(name = "primary_name")
    private String primaryName;

    @Column(name = "birth_year")
    private String brithYear;

    @Column(name = "death_year")
    private String deathYear;

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

    public String getBrithYear() {
        return brithYear;
    }

    public void setBrithYear(String brithYear) {
        this.brithYear = brithYear;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }
}
