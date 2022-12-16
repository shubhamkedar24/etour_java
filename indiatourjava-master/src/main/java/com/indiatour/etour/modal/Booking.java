package com.indiatour.etour.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Booking_Id")
	private int bookingid;
	
	@Column(name="Bookingdate")
	private String bookingdate;
	
	@Column(name="Cust_Id")
	private int customerid;
	
	@Column(name="Package_Id")
	private int packageid;
	
	@Column(name="Passangers")
	private int totalpassanger;
	@Column(name="Touramount")
	private double totalcost;
	@Column(name="Taxes")
	private double totalgstcost;
	@Column(name="Totalamount")
	private double totalfinalcost;
	
	@Column(name="Flag")
	private int flag;
	
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	
	public int getTotalpassanger() {
		return totalpassanger;
	}
	public void setTotalpassanger(int totalpassanger) {
		this.totalpassanger = totalpassanger;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	public double getTotalgstcost() {
		return totalgstcost;
	}
	public void setTotalgstcost(double totalgstcost) {
		this.totalgstcost = totalgstcost;
	}
	public double getTotalfinalcost() {
		return totalfinalcost;
	}
	public void setTotalfinalcost(double totalfinalcost) {
		this.totalfinalcost = totalfinalcost;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", bookingdate=" + bookingdate + ", customerid=" + customerid
				+ ", packageid=" + packageid + ", totalpassanger=" + totalpassanger + ", totalcost=" + totalcost
				+ ", totalgstcost=" + totalgstcost + ", totalfinalcost=" + totalfinalcost + "]";
	}
		
}
