package com.education.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.education.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT * FROM user WHERE email_id = :emailId AND password = :password", nativeQuery = true)
    Optional<User> findByEmailIdAndPasswordForLogin(String emailId, String password);

}
