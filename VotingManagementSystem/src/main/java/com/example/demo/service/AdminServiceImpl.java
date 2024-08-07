package com.example.demo.service;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.Admin;
//import com.example.demo.repository.AdminRepository;
//
//@Service
//public class AdminServiceImpl implements AdminService {
//
//    @Autowired
//    private AdminRepository adminRepo;
//
//    @Override
//    public void saveAdmin(Admin admin) {
//        adminRepo.save(admin);
//    }
//
//    @Override
//    public List<Admin> adminlist() {
//        return adminRepo.findAll();
//    }
//
//    @Override
//    public Admin findByUsernameAndPassword(String username, String password) {
//        return adminRepo.findByUsernameAndPassword(username, password);
//    }
//}


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepo;

    @Override
    public void saveAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    @Override
    public List<Admin> adminlist() {
        return adminRepo.findAll();
    }

    @Override
    public Admin findByUsernameAndPassword(String username, String password) {
        return adminRepo.findByUsernameAndPassword(username, password);
    }
}