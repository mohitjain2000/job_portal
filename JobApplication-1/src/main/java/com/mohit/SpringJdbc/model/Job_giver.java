package com.mohit.SpringJdbc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Job_giver")
public class Job_giver 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	private int Id;
	@Column(name = "user_name")
	 private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")  
	private String password;
	@Column(name = "Name")
   private String Name; //
	
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public Job_giver(String username, String email, String password, String name) {
			super();
			this.username = username;
			this.email = email;
			this.password = password;
			Name = name;
		}
		public Job_giver() {
			super();
			// TODO Auto-generated constructor stub
		}
}
