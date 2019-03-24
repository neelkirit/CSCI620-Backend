package com.csci620.project.Modals;

import com.csci620.project.Entities.Genre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;

/*
 * GenreRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface GenreRepository extends CrudRepository<Genre, String> {
    @Transactional
    @Query(value = "select tb.primary_title from title_genre_normalized g, title_basics_normalized tb WHERE g.tconst = tb.tconst " +
            "and g.genres = :name LIMIT :startLimit , :endLimit", nativeQuery = true)
    ArrayList<Object[]> findByGenre(@Param("name") String name,
                                    @Param("startLimit") int startLimit,
                                    @Param("endLimit") int endLimit);

    @Transactional
    @Query(value = "select g.genres, tr.average_rating from title_genre_normalized g, title_ratings tr, Title_Basics_Normalized t " +
            "where t.tconst = tr.tconst and tr.tconst = g.tconst and g.genres" +
            " = :name order by tr.average_rating desc LIMIT :startLimit , " +
            ":endLimit"
            ,nativeQuery = true)
    ArrayList<Object[]> findByTopRating(@Param("name") String name, @Param(
            "startLimit") int startLimit, @Param("endLimit") int endLimit);

}
