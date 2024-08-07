package com.example.demo.service;

import java.util.List;

import org.aspectj.weaver.loadtime.Options;

import com.example.demo.entity.Voter;
import com.example.demo.repository.VoterRepository;

public class VoterServiceImpl  implements Voterservice{
	VoterRepository voterRepo;
	

	@Override
	public Voter saveVoter(Voter voter) {
		
		
		// TODO Auto-generated method stub
		return  voterRepo.save(voter);
	}

	@Override
	public List<Voter> voterlist() {
		// TODO Auto-generated method stub
		return voterRepo.findAll();
	}

	@Override
	public void deleteByid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Voter findByid(int id) {
		
		
		// TODO Auto-generated method stub
		
		
		return voterRepo.getById(id);
	}

	@Override
	public Voter updateVoter(Voter voter) {
		// TODO Auto-generated method stub
		return  voterRepo.save(voter);
	}

	
	

}
