package com.indiatour.etour.payload.request;

import java.util.Set;



public class SignupRequest {

 
  private String email;

  private Set<String> role;

  private String password;
  
  private String firstname;
  
  private String lastname;
  
  private String dob;
  
  private String gender;
  
  private String mobile;
  



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

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
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

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
