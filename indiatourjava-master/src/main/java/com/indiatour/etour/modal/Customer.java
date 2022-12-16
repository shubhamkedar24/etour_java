package com.indiatour.etour.modal;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer {
	
	private int cust_Id;
	@Column(name="FirstName")
	private String firstname;
	@Column(name="LastName")
	private String lastname;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="Gender")
	private String gender;
	@Column(name="Mobile")
	private String mobile;
	@Column(name="DOB")
	private String dob;

	
	@Access(AccessType.FIELD)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(  name = "user_roles",joinColumns= @JoinColumn(name ="user_id"),inverseJoinColumns= @JoinColumn(name ="role_id"))
	private Set<Role> roles = new HashSet<>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cust_Id")
	public int getCust_Id() {
		return cust_Id;
	}
	
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	
	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Customer() {
		
	}
	
	

	public Customer(String firstname, String lastname, String email, String password, String gender,
			String mobile, String dob) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", gender=" + gender + ", mobile=" + mobile + ", dob=" + dob
				+ ", roles=" + roles + "]";
	}




	

	
}
