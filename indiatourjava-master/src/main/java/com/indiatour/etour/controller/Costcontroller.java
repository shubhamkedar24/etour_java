package com.indiatour.etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.indiatour.etour.modal.Cost;
import com.indiatour.etour.services.Costservice;

@RestController
@CrossOrigin
public class Costcontroller {
	
	@Autowired
	Costservice cservice;
	
	//for passanger table page
	@GetMapping(value="/cost/{sectormasterid}")
	public List<Cost> getcost(@PathVariable int sectormasterid)
	{
		return cservice.getCost(sectormasterid);
		
	}
	
	//for iternery cost page
	@GetMapping(value="/costs/{subsectorid}")
	public List<Cost> getcostbysubsectorid(@PathVariable String subsectorid)
	{
		return cservice.getcostbysubsector(subsectorid);
		
	}

	//for searchbycost funcationality
	@GetMapping(value="/findcost")
	public List<Cost> getallcost()
	{
		return cservice.getcost();
		
	}
	

	
}
