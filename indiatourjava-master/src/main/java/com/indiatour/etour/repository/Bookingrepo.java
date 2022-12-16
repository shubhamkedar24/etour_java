package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Booking;


@Repository
public interface Bookingrepo extends JpaRepository<Booking, Integer> {
	
	@Query(value = "from Booking b where Cust_Id=?1")
	public List<Booking> findBybookingid(int customerid);
	
	
	@Modifying
	@Query(value = "update Booking b set Flag=1 where Booking_Id = ?1")
	public void setflag(int bookingid);
	
	@Query(value = "from Booking b where Flag=1")
	public List<Booking> findByflagone();
}
