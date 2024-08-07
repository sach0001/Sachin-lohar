package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Voter;

@Service
public interface Voterservice {
	public Voter saveVoter( Voter voter);
	
	public  List<Voter>voterlist();
	
	public void deleteByid(int id);
	
	public Voter findByid(int id);
	
	public Voter updateVoter( Voter voter);
	
	
	
	
	
	

}
