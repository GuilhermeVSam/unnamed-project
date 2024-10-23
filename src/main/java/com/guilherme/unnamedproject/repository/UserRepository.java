package com.guilherme.unnamedproject.repository;

import com.guilherme.unnamedproject.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}