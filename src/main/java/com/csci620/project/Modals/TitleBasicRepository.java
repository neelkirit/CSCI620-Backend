package com.csci620.project.Modals;

import com.csci620.project.Entities.TitleAkas;
import com.csci620.project.Entities.TitleBasicsNormalized;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/*
 * TitleBasicRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface TitleBasicRepository extends CrudRepository<TitleBasicsNormalized, String> {

    @Transactional
    @Query(value = "select t from TitleBasicsNormalized t WHERE t.primaryTitle LIKE" +
            " %:primaryTitle%")
    ArrayList<TitleBasicsNormalized> findByPrimaryTitle(@Param("primaryTitle") String primaryTitle);

    @Transactional
    @Query(value = "select t from TitleAkas t WHERE t.title LIKE" +
            " %:title% and t.language = :language")
    ArrayList<TitleAkas> findByPrimaryTitleWithAkas(@Param("title") String title,
                                                    @Param("language") String language);

    @Transactional
    @Query(value = "" +
            "SELECT t.*" +
            "FROM title_basics_normalized  as t , title_principals_replica as" +
            " tpr, name_basics_normalized as nbn, names_profession as np " +
            "WHERE t.tconst = tpr.tconst " +
            "and tpr.nconst = nbn.nconst " +
            "      and nbn.nconst = np.nconst " +
            "      and np.primary_profession LIKE %:profession%" +
            "      and nbn.primary_name LIKE %:primaryName%",
            nativeQuery = true)
    List<Object[]> findByActor(@Param("primaryName") String primaryName,
                               @Param("profession") String profession);

    @Transactional
    @Query(value = "" +
            "SELECT tbn.* " +
            "FROM Title_Basics_Normalized as tbn, title_ratings as tr WHERE " +
            "tbn.tconst = tr.tconst  " +
            "ORDER BY tr.num_votes  DESC",
            nativeQuery = true)
    List<Object[]> findByMostVoted();
}

