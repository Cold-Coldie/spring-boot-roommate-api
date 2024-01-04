package com.coldie.roommateapi.repository;

import com.coldie.roommateapi.entity.Roommate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoommateRepository extends CrudRepository<Roommate, Long> {
    @Query("SELECT r.id, r.firstName, r.lastName, r.course, r.level FROM Roommate r WHERE r.id=:id")
    List<String> findRoommateByIdAsString(Long id);

    @Query("SELECT new com.coldie.roommateapi.entity.Roommate(r.id, r.firstName, r.lastName, r.course, r.level) FROM Roommate r WHERE r.level=:level")
    List<Roommate> findRoommateByLevel(int level);
}
