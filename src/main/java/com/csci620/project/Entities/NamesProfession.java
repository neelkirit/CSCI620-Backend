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
    @JoinColumn(name = "nconst", unique = true, nullable = false)
    private NameBasics nameBasics;

    @Id
    @Column(name = "primary_profession", unique = true, nullable = false)
    private String primaryProfession;

    public NameBasics getNameBasics() {
        return nameBasics;
    }

    public void setNameBasics(NameBasics nameBasics) {
        this.nameBasics = nameBasics;
    }

    public String getPrimaryProfession() {
        return primaryProfession;
    }

    public void setPrimaryProfession(String primaryProfession) {
        this.primaryProfession = primaryProfession;
    }
}
