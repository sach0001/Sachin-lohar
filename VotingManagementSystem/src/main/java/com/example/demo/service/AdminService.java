package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Admin;


public interface AdminService {
    void saveAdmin(Admin admin);
    List<Admin> adminlist();
    Admin findByUsernameAndPassword(String username, String password);
	
}