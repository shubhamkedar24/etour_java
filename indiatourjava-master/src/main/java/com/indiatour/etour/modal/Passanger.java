package com.indiatour.etour.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="passanger")
public class Passanger {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="Pass_Id")
	private int passangerid;
	@Column(name="Firstname")
	private String firstname;
	@Column(name="Lastname")
	private String lastname;
	@Column(name="Address")
	private String address;
	@Column(name="Mobile")
	private String mobile;
	@Column(name="Passport")
	private String passport;
	@Column(name="Aadharcard")
	private String adharcard;
	@Column(name="DOB")
	private String dob;
	@Column(name="Gender")
	private String gender;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private int pincode;
	@Column(name="State")
	private String state;
	@Column(name="Package_Id")
	private int packageid;
	@Column(name="Cust_Id")
	private int customerid;
	@Column(name="cost")
	private double cost;
	
	@Column(name="flag")
	private int flag;
	
	@ManyToOne
	private Customer customer;
	
	public int getPassangerid() {
		return passangerid;
	}
	public void setPassangerid(int passangerid) {
		this.passangerid = passangerid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Passanger [passangerid=" + passangerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", mobile=" + mobile + ", passport=" + passport + ", adharcard=" + adharcard
				+ ", dob=" + dob + ", gender=" + gender + ", city=" + city + ", pincode=" + pincode + ", state=" + state
				+ ", packageid=" + packageid + ", customerid=" + customerid + ", cost=" + cost + "]";
	}
	
	
}
