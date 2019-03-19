package com.csci620.project.Modals;


import com.csci620.project.Entities.NameBasics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public interface NameBasicRepository extends CrudRepository<NameBasics, String> {
    @Transactional
    @Query(value = "select n from NameBasics n WHERE n.primaryName LIKE" +
            " %:primaryName%")
    ArrayList<NameBasics> findByPrimaryName(@Param("primaryName") String primaryName);
}
