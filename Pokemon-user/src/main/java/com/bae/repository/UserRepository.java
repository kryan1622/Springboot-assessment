package com.bae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.entities.Users;

public interface UserRepository extends JpaRepository< Users, Long>{


}
