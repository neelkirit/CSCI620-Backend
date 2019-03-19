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
    @Query(value = "select g from Genre g WHERE g.name LIKE" +
            " %:name%")
    ArrayList<Genre> findByGenre(@Param("name") String name);
}
