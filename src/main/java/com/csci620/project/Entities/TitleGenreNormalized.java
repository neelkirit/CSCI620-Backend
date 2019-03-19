package com.csci620.project.Entities;

import javax.persistence.*;
import java.io.Serializable;

/*
 * TitleGenreNormalized.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
@Entity
@Table(name = "title_genre_normalized")
public class TitleGenreNormalized implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tconst", nullable = false)
    private TitleBasicsNormalized titleBasicsNormalized;

    @Id
    @Column(name = "genres", nullable = false)
    private String genres;

    public TitleBasicsNormalized getTitleBasicsNormalized() {
        return titleBasicsNormalized;
    }

    public void setTitleBasicsNormalized(TitleBasicsNormalized titleBasicsNormalized) {
        this.titleBasicsNormalized = titleBasicsNormalized;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
