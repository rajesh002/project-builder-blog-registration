package model;

import java.time.LocalDate;


public class User{
	String name;
	int email;
	LocalDate date;
	public User(String name,int email,LocalDate date){
		this.name=name;
		this.email=email;
		this.date=date;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(int email) {
		this.email=email;
	}
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public String getName() {
		return this.name;
	}
	public int getEmail() {
		return this.email;
	}
	LocalDate getDate() {
		return this.date;
	}
	
}