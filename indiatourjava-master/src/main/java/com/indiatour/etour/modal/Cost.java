package com.indiatour.etour.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cost")
public class Cost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cost_Id")
	private int costid;
	
	@Column(name="Sectormaster_Id")
	private int sectormasterid;
	@Column(name="Singleoccupancy")
	private double singleoccupancy;
	@Column(name="twinperson")
	private double Twinperson;
	@Column(name="Triplesharing")
	private double tripplesharing;
	@Column(name="Childwithparents")
	private double childwithparent;
	
	@Column(name="Childwithoutparents")
	private double childwithoutparents;
	@Column(name="Validfrom")
	private String validfrom;
	@Column(name="validto")
	private String validto;
	public int getCostid() {
		return costid;
	}
	public void setCostid(int costid) {
		this.costid = costid;
	}
	public int getSectormasterid() {
		return sectormasterid;
	}
	public void setSectormasterid(int sectormasterid) {
		this.sectormasterid = sectormasterid;
	}
	public double getSingleoccupancy() {
		return singleoccupancy;
	}
	public void setSingleoccupancy(double singleoccupancy) {
		this.singleoccupancy = singleoccupancy;
	}
	public double getTwinperson() {
		return Twinperson;
	}
	public void setTwinperson(double twinperson) {
		Twinperson = twinperson;
	}
	public double getTripplesharing() {
		return tripplesharing;
	}
	public void setTripplesharing(double tripplesharing) {
		this.tripplesharing = tripplesharing;
	}
	public double getChildwithparent() {
		return childwithparent;
	}
	public void setChildwithparent(double childwithparent) {
		this.childwithparent = childwithparent;
	}
	public double getChildwithoutparents() {
		return childwithoutparents;
	}
	public void setChildwithoutparents(double childwithoutparents) {
		this.childwithoutparents = childwithoutparents;
	}
	public String getValidfrom() {
		return validfrom;
	}
	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
	public String getValidto() {
		return validto;
	}
	public void setValidto(String validto) {
		this.validto = validto;
	}
	@Override
	public String toString() {
		return "Cost [costid=" + costid + ", sectormasterid=" + sectormasterid + ", singleoccupancy=" + singleoccupancy
				+ ", Twinperson=" + Twinperson + ", tripplesharing=" + tripplesharing + ", childwithparent="
				+ childwithparent + ", childwithoutparents=" + childwithoutparents + ", validfrom=" + validfrom
				+ ", validto=" + validto + "]";
	}
	
	
}
