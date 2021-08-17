package com.example.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "employee")
	public class Employee {
		
		@Id
		private int id;
		
		@Column(name = "firstname")
		private String firstName;
		
		@Column(name = "lastname")
		private String lastName;
		
		@Column(name = "email")
		private String email;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		

}
