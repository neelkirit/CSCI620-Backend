package com.csci620.project.Modals;

import com.csci620.project.Entities.Genre;
import org.springframework.data.repository.CrudRepository;

/*
 * GenreRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface GenreRepository extends CrudRepository<Genre, String> {
}
