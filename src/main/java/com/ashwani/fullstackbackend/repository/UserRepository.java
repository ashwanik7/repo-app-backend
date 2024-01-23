package com.ashwani.fullstackbackend.repository;

import com.ashwani.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}