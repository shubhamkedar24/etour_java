package com.indiatour.etour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indiatour.etour.modal.Passanger;
import com.indiatour.etour.repository.Passangerrepo;

@Service
@Transactional
public class PassangerServiceImpl implements PassangerService{

	@Autowired
	Passangerrepo passrepo;
	
	@Override
	public List<Passanger> getpassangerbyid(int passangerid,int custid) {
		// TODO Auto-generated method stub
		return passrepo.findBypackageid(passangerid,custid);
	}

	@Override
	public Passanger postpassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return passrepo.save(passanger);
	}

	@Override
	public String deletepassanger(int passangerid) {
		// TODO Auto-generated method stub
		passrepo.deleteById(passangerid);
		return "Deleted sucssfully";
		
	}

	@Override
	public void canclebooking() {
		// TODO Auto-generated method stub
		passrepo.canclebooking();
	}
	

}
