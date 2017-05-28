package com.da.service;

import com.da.beans.PatientBean;
import com.da.dao.RegistrationDaoImplementation;



public class RegistrationServiceImplementation implements RegistrationService{
	private RegistrationDaoImplementation regDao;

	@Override
	public void insertPatient(PatientBean pat) {
		
		System.out.println("insertCustomer method of RegistrationServiceImpl method!!!");
        regDao.insertPatient(pat);
        
	}
	
	public void setRegDao(RegistrationDaoImplementation regDao) {
        this.regDao = regDao;
    }
}
