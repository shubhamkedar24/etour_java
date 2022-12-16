package com.indiatour.etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indiatour.etour.modal.Passanger;
import com.indiatour.etour.services.PassangerService;

@RestController
@CrossOrigin
public class PassangerController {

	@Autowired
	PassangerService passangerservice;
	
	//for passenger form table
	@GetMapping(value="/passanger/{packageid}/{custid}")
	public List<Passanger> getpassangerbyid(@PathVariable int packageid,@PathVariable int custid)
	{		
	  return passangerservice.getpassangerbyid(packageid,custid);
	}
	
	//for posting passenger details
	@PostMapping(value="/passangers")
	public void postpassanger(@RequestBody Passanger passanger)
	{
		passangerservice.postpassanger(passanger);
		
	}
	
	//for deleting the passenger from passenger table
	@DeleteMapping(value="/delete/{passangerid}")
	public String deletepassangerbyid(@PathVariable int passangerid)
	{
		passangerservice.deletepassanger(passangerid);
		return "Deleted sucessfully";
	}
	
	//for cancel booking cancel button
	@DeleteMapping(value="/canclebooking")
	public void canclebooking()
	{
		passangerservice.canclebooking();
	}
}
