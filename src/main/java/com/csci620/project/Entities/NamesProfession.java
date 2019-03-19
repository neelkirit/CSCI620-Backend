package com.csci620.project.Entities;

/*
 * NamesProfession.java
 *
 * Version: 1.0
 *
 * Revisions:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "names_profession")
public class NamesProfession implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nconst", nullable = false)
    private NameBasicsNormalized nameBasicsNormalized;

    @Id
    @Column(name = "primary_profession", nullable = false)
    private String primaryProfession;

    public NameBasicsNormalized getNameBasicsNormalized() {
        return nameBasicsNormalized;
    }

    public void setNameBasicsNormalized(NameBasicsNormalized nameBasicsNormalized) {
        this.nameBasicsNormalized = nameBasicsNormalized;
    }

    public String getPrimaryProfession() {
        return primaryProfession;
    }

    public void setPrimaryProfession(String primaryProfession) {
        this.primaryProfession = primaryProfession;
    }
}
