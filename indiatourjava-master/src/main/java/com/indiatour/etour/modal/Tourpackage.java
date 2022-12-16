package com.indiatour.etour.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourpackage")
public class Tourpackage {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Package_Id")
	private int packageid;
	
	@Column(name="Package_Name")
	private String packagename;
	
	@Column(name="Sectormaster_Id")
	private int sectormasterid;
	
	@Column(name="Startdate")
	private String startdate;
	
	@Column(name="Enddate")
	private String enddate;
	
	@Column(name="Tourdates")
	private String tourdate;

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public int getSectormasterid() {
		return sectormasterid;
	}

	public void setSectormasterid(int sectormasterid) {
		this.sectormasterid = sectormasterid;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getTourdate() {
		return tourdate;
	}

	public void setTourdate(String tourdate) {
		this.tourdate = tourdate;
	}

	@Override
	public String toString() {
		return "Package [packageid=" + packageid + ", packagename=" + packagename + ", sectormasterid=" + sectormasterid
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", tourdate=" + tourdate + "]";
	}
	
	

}
