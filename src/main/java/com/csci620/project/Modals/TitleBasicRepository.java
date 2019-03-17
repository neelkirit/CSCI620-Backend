package com.csci620.project.Modals;

import com.csci620.project.Entities.TitleBasics;
import org.springframework.data.repository.CrudRepository;

/*
 * TitleBasicRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface TitleBasicRepository extends CrudRepository<TitleBasics, String> {

//        @Transactional
//        TitleBasics findMovieBy(@Param("primaryTitle") String primaryTitle);


}
