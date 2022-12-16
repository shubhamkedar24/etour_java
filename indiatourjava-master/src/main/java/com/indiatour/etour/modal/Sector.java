package com.indiatour.etour.modal;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
	
	
	private int sectormasterid;
	
	
	private String sectorid;
	
	
	private String subsectorid;
	
	
	private String name;
	
	
	private String imgpath;
	private int flag;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Sectormaster_Id")
	public int getSectormasterid() {
		return sectormasterid;
	}
	
	public void setSectormasterid(int sectormasterid) {
		this.sectormasterid = sectormasterid;
	}

	@Column(name="Sector_Id")
	public String getSectorid() {
		return sectorid;
	}

	public void setSectorid(String sectorid) {
		this.sectorid = sectorid;
	}
	
	@Column(name="Subsector_Id")
	public String getSubsectorid() {
		return subsectorid;
	}

	public void setSubsectorid(String subsectorid) {
		this.subsectorid = subsectorid;
	}
	@Column(name="Sectorname")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="Imgpath")
	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	
	
	@Column(name="Flag")
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Sector [sectormasterid=" + sectormasterid + ", sectorid=" + sectorid + ", subsectorid=" + subsectorid
				+ ", name=" + name + ", imgpath=" + imgpath + "]";
	}
	
	

}

