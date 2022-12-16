package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Cost;

@Repository
public interface Costrepo extends JpaRepository<Cost, String>{

	@Query(value = "from Cost c where Sectormaster_Id=?1")
	public List<Cost> findBycostid(int sectormasterid);
	
	@Query(value = "from Cost c where Sectormaster_Id=?1")
	public Cost findBysubsectorid(int sectormasterid);
}
