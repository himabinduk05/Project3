package com.da.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.da.beans.PatientBean;


public class RegistrationDaoImplementation implements RegistrationDao{
	private HibernateTemplate ht;
	@Override
	public void insertPatient(PatientBean pat) {
		
		System.out.println("insertCustomer of RegistrationDAOImpl class.....");
        ht.save(pat);
        
	}
	
	public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
}
