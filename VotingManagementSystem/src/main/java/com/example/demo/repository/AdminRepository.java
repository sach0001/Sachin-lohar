package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;



@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    // Derived query method to find Admin by username and password
    Admin findByUsernameAndPassword(String username, String password);
}