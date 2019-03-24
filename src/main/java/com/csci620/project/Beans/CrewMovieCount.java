package com.csci620.project.Beans;

import java.math.BigInteger;

/*
 * CrewMovieCount.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public class CrewMovieCount {

    private String primaryName;

    private BigInteger count;

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
}
