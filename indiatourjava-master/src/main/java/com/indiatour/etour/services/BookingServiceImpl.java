package com.indiatour.etour.services;


import java.time.LocalDate;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.indiatour.etour.modal.Booking;
import com.indiatour.etour.modal.Customer;
import com.indiatour.etour.repository.Bookingrepo;
import com.indiatour.etour.repository.Customerrepo;
import com.indiatour.etour.repository.Passangerrepo;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	Bookingrepo bookrepo;
	
	@Autowired
	Passangerrepo passrepo;
	
	@Autowired
	Emailservice senderservice;
	
	@Autowired
	Customerrepo custrepo;
	
	@Override
	public void postbooking(Booking booking) {
		// TODO Auto-generated method stub
		passrepo.setflag();
		//int custid=booking.getCustomerid();
		//int packid=booking.getPackageid();
		bookrepo.save(booking);
		
	}

	@Override
	public void canceltours(int bookingid) {
		// TODO Auto-generated method stub
		bookrepo.setflag(bookingid);
	}

	@Override
	public void deletetour(int bookingid) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(bookingid);
	}

}
