package com.example.demoVersion.db;

import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepository extends CrudRepository<UserCredentials, Integer> {
}
