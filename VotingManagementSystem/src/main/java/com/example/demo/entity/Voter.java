package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity

public class Voter {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotBlank(message="Name cannot be blank")
	@Pattern(regexp="^a-zA-Z+$", message="Only  characters allowed")
	@Size(min=4,max=8,message="Only 4 to 8 Characters are allowed ")
	private String Votername;
	private Date DOB;
	private String gender;
	private String Username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVotername() {
		return Votername;
	}
	public void setVotername(String votername) {
		Votername = votername;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Voter(int id,
			@NotBlank(message = "Name cannot be blank") @Pattern(regexp = "^a-zA-Z+$", message = "Only  characters allowed") @Size(min = 4, max = 8, message = "Only 4 to 8 Characters are allowed ") String votername,
			Date dOB, String gender, String username, String password) {
		super();
		this.id = id;
		Votername = votername;
		DOB = dOB;
		this.gender = gender;
		Username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Voter [id=" + id + ", Votername=" + Votername + ", DOB=" + DOB + ", gender=" + gender + ", Username="
				+ Username + ", password=" + password + "]";
	}
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
