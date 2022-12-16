package com.indiatour.etour.modal;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="itinerary")
public class Iternery {
	
	private int iterneryid;
	private String day;
	private String startlocation;
	private String description;
	private String sectormasterid;

	
	
	@Id
	@Column(name="Iternery_Id")
	public int getIterneryid() {
		return iterneryid;
	}
	public void setIterneryid(int iterneryid) {
		this.iterneryid = iterneryid;
	}
	
	@Column(name="Day")
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	@Column(name="Startlocation")
	public String getStartlocation() {
		return startlocation;
	}
	public void setStartlocation(String startlocation) {
		this.startlocation = startlocation;
	}
	
	@Column(name="Description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="Sectormaster_Id")
	public String getSectormasterid() {
		return sectormasterid;
	}
	public void setSectormasterid(String sectormasterid) {
		this.sectormasterid = sectormasterid;
	}
	
	
}
