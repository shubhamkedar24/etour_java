package com.indiatour.etour.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.indiatour.etour.modal.Tourpackage;
import com.indiatour.etour.services.Packageservice;

@RestController
@CrossOrigin
public class Tourpackagecontroller {

	@Autowired
	Packageservice packservice;
	
	
	//for getting name,date page details
	@GetMapping(value="/package/{sectormasterid}")
	public List<Tourpackage> getpackage(@PathVariable int sectormasterid)
	{
		return packservice.getpackage(sectormasterid);
	}
	
	//for getting itenery,booking date page details
	@GetMapping(value="/packages/{packageid}")
	public List<Tourpackage> getpackageid(@PathVariable int packageid)
	{
		List<Tourpackage> tpack=packservice.getpackagebysectorid(packageid);
		return tpack;
	}
	
	//for search by date filter
	@GetMapping(value="/package")
	public List<Tourpackage> getTourbyperoid()
	{
		return packservice.searchpackagebydates();
	}
	
	
}
