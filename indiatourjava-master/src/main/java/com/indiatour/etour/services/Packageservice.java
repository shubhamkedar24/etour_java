package com.indiatour.etour.services;

import java.util.List;

import com.indiatour.etour.modal.Tourpackage;

public interface Packageservice {
	
	public List<Tourpackage> getpackage(int sectormasterid);
	public List<Tourpackage> getpackagebysectorid(int packageid);
	public List<Tourpackage> searchpackagebydates();

}
