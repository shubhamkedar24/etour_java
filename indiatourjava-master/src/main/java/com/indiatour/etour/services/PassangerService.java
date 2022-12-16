package com.indiatour.etour.services;

import java.util.List;

import com.indiatour.etour.modal.Passanger;

public interface PassangerService {

	public List<Passanger> getpassangerbyid(int passangerid,int custid);
	
	public Passanger postpassanger(Passanger passanger);
	
	public String deletepassanger(int passangerid);
	
	public void canclebooking();
}
