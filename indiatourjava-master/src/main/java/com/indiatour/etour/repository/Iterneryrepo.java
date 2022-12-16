package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Iternery;

@Repository
public interface Iterneryrepo extends JpaRepository<Iternery, Integer>{
	
	@Query(value = "from Iternery i where Sectormaster_Id=?1")
	public List<Iternery> findByIternery(int sectorid);
}
