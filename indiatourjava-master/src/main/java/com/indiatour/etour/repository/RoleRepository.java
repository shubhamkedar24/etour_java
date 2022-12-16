package com.indiatour.etour.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indiatour.etour.modal.ERole;
import com.indiatour.etour.modal.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(ERole name);
	

}
