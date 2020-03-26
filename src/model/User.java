package model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class User{
	String password;
	String email;
	LocalDateTime date;
	public User(String name,String password,LocalDateTime date2){
		this.password=name;
		this.email=password;
		this.date=date2;
		
	}
	public void setPassword(String name) {
		this.password=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDate(LocalDateTime ld) {
		this.date=ld;
	}
	public String getPassword() {
		return this.password;
	}
	public String getEmail() {
		return this.email;
	}
   public LocalDateTime getDate() {
		return this.date;
	}
	
}