package com.indiatour.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.Tourpackage;

@Repository
public interface Packagerepo extends JpaRepository<Tourpackage, Long>{

	@Query(value = "from Tourpackage p where Sectormaster_Id=?1")
	public List<Tourpackage> findBypackageid(int sectormasterid);
	

	@Query(value = "from Tourpackage p where Package_Id=?1")
	public List<Tourpackage> findBysectorid(int pacakgeid);
	
}
