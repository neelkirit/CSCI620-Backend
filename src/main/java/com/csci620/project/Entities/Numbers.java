package com.csci620.project.Entities;

/*
 * Numbers.java
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
@Table(name = "numbers")
public class Numbers {

    @Id
    @Column(name = "no", unique = true, nullable = false)
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
