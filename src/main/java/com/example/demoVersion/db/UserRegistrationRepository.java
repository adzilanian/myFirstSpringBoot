package com.example.demoVersion.db;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRegistrationRepository extends CrudRepository<UserCredentials, Integer> {

    Optional<UserCredentials> findByUnameAndUpassword(String uname, String upassword);

}
