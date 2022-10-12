package com.test.shareGarden.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByUserName(String userName);

    @Query("select u from User u where u.userName = ?1 and u.password = ?2")
    Optional<User> findByUserNameAndPassword(String userName, String password);


}