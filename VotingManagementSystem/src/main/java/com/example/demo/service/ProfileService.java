package com.example.demo.service;

import com.example.demo.entity.Profile;

public interface ProfileService {
	public Profile setProfile(Profile profile);
	
	public Profile getByid(int id);
	
	public boolean existByid(int id);
	
	

}
