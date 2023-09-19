package com.example.demoapplication.repository;

import com.example.demoapplication.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
