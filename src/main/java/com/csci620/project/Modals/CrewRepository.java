package com.csci620.project.Modals;

import com.csci620.project.Entities.TitleCrew;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/*
 * CrewRepository.java
 *
 * Version: 1.0
 *
 * Revisions:
 */
public interface CrewRepository extends CrudRepository<TitleCrew, String> {
    @Transactional
    @Query(value = "select n.primary_name, tb.primary_title, t.* from title_principals_replica t, name_basics_normalized n, " +
            "Title_Basics_Normalized tb WHERE t.nconst = n.nconst and t.tconst = tb.tconst and n.primary_name " +
            "LIKE %:name% and t.category = :category"
    ,nativeQuery = true)
    ArrayList<Object[]> findByProfession(@Param("name") String name, @Param("category") String category);

    @Transactional
    @Query(value = "select n.primary_name, COUNT(*) from title_principals_replica t, name_basics_normalized n, " +
            "Title_Basics_Normalized tb WHERE t.nconst = n.nconst and t.tconst = tb.tconst and n.primary_name " +
            "LIKE %:name% and t.category = :category group by n.primary_name having COUNT(n.primary_name) >= :cnt"
            ,nativeQuery = true)
    ArrayList<Object[]> findByNumOfMovies(@Param("name") String name, @Param("category") String category, @Param("cnt") Integer cnt);

    @Transactional
    @Query(value = "SELECT n.primary_name, t.primaryTitle, tr.average_rating from title_basics t " +
            "INNER JOIN title_ratings tr " +
            "ON tr.tconst = t.tconst " +
            "INNER JOIN title_principals_replica tp " +
            "ON tr.tconst = tp.tconst " +
            "INNER JOIN name_basics_normalized n " +
            "ON tp.nconst = n.nconst " +
            "WHERE tr.average_rating BETWEEN :start and :end " +
            "and n.primary_name LIKE %:name%"
            ,nativeQuery = true)
    ArrayList<Object[]> findByCrewRatings (@Param("name") String name, @Param("start") Integer start, @Param("end") Integer end);
}
