package com.test.shareGarden.domain.user.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query("select l from Location l where l.contact.user.id = ?1")
    List<Location> findAllBy(Integer userId);



}