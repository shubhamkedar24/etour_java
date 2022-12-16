package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Passanger;

@Repository
public interface Passangerrepo extends JpaRepository<Passanger, Integer>{
	
	@Query(value = "from Passanger p where (Package_Id=?1 and Cust_Id=?2 and flag=0)")
	public List<Passanger> findBypackageid(int packageid,int custid);
	
	@Modifying
	@Query(value = "update Passanger p set flag=1")
	public void setflag();
	
	@Modifying
	@Query(value = "delete Passanger p where flag=0")
	public void canclebooking();
}
