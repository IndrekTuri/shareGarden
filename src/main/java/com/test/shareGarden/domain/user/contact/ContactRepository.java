package com.test.shareGarden.domain.user.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {



    @Query("select c from Contact c where c.user.id = ?1")
    Optional<Contact> findByUserId(Integer userId);

}