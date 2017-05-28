package com.da.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.da.beans.AppointmentBean;


public class ViewPatientDaoImplementation implements ViewPatientDao {
   private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
	public List viewPatientDetails(AppointmentBean appointment){
		List list=new ArrayList();
		System.out.println("In viewpatientdao.....Before");
		String query=" from AppointmentBean where doctorId=?";
		
		list=ht.find(query,new Object[]{appointment.getDoctorId()});
	     
	    System.out.print("------------------------------"+list);
	    return list;
		
		
	}
}
