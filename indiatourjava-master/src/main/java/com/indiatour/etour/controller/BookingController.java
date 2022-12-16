package com.indiatour.etour.controller;

import java.time.LocalDate;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.indiatour.etour.modal.Booking;
import com.indiatour.etour.modal.Customer;
import com.indiatour.etour.repository.Bookingrepo;
import com.indiatour.etour.repository.Customerrepo;
import com.indiatour.etour.services.BookingService;
import com.indiatour.etour.services.Emailservice;

@RestController
@CrossOrigin
public class BookingController {
	
	@Autowired
	BookingService bookservice;
	
	@Autowired
	Bookingrepo bookrepo;
	
	@Autowired
	Emailservice senderservice;
	
	@Autowired
	Customerrepo custrepo;
	
	@PutMapping(value="/canceltour/{bookingid}")
	public void setflag(@PathVariable int bookingid)
	{
		 bookservice.canceltours(bookingid);
	}
	
	@GetMapping(value="/allcanceltours")
	public List<Booking> getallcanceltour()
	{
		return bookrepo.findByflagone();
	}
	
	@DeleteMapping(value="/tourdelete/{bookingid}")
	public void deletetourbyid(@PathVariable int bookingid)
	{
		bookservice.deletetour(bookingid);
	}
	
	//posting the data from pdf page
	@PostMapping(value="/booking/", headers = "Accept=application/json")
	public void postbookingdetails(@RequestBody Booking booking)
	{
		bookservice.postbooking(booking);
		
		int custid=booking.getCustomerid();
		int packid=booking.getPackageid();
		   { 
			   	LocalDate now=LocalDate.now();
			    String newnow=now.toString();
			     List<Booking> bookingdetails =bookrepo.findAll();
			   
			     for(Booking book:bookingdetails)
			     {
			    	 int pkgid=book.getPackageid();
			    	 int cid=book.getCustomerid();
			    	 String date=book.getBookingdate();
			    	 if(cid==custid && date.equals(newnow) && pkgid==packid)
			    	 {
			    		Customer cust=custrepo.findBycustomercid(cid);
			    		
			    	 try {
						senderservice.sendEmailWithAttachment(cust.getEmail(), "Your Booking Successful",
								   "Invoice of booking", "C:\\Users\\DELL\\Downloads\\Invoice"+custid+pkgid+newnow+".pdf");
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						
						e.printStackTrace();
					}  }
			     }
			    	 
			 }
	}
	
	//for customer profile
	@GetMapping(value="/alltours/{customerid}")
	public List<Booking> getbookingdetails(@PathVariable int customerid)
	{
		return bookrepo.findBybookingid(customerid);
	}
	
	

}
