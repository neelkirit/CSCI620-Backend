package com.csci620.project.Modals;

import com.csci620.project.Entities.TitleBasics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/*
 * TitleBasicRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface TitleBasicRepository extends CrudRepository<TitleBasics, String> {

    @Transactional
    @Query(value = "select t from TitleBasics t WHERE t.primaryTitle LIKE" +
            " %:primaryTitle%")
    ArrayList<TitleBasics> findByPrimaryTitle(@Param("primaryTitle") String primaryTitle);

    @Transactional
    @Query(value = "select t from TitleAkas t WHERE t.primaryTitle LIKE" +
            " %:primaryTitle% and t.language = :language")
    ArrayList<TitleBasics> findByPrimaryTitleWithAkas(@Param("primaryTitle") String primaryTitle, @Param("language") String language);

}

