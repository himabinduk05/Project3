package com.da.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.da.beans.AppointmentBean;
import com.da.beans.PatientBean;
import java.sql.PreparedStatement;  


public class BookAppointmentDaoImplementation implements BookAppointmentDao{
	private HibernateTemplate ht;

	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	static int d=1;
	static int coupon_d1_morn=1;
	static int coupon_d1_aft=1;
	static int coupon_d2_morn=1;
	static int coupon_d2_aft=1;
	static int coupon_d3_morn=1;
	static int coupon_d3_aft=1;
	static int s=1;
	 String appointment_coupon;	
	private JdbcTemplate jdbcTemplate; 
	boolean result;
	String status="NO";
	String date;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public String bookAppointment(AppointmentBean appointment){
		System.out.println("IN BOOK APPOINTMENT  IMPLEMENTATION");
		System.out.println(appointment.getAppointmentBooked());
		System.out.println(appointment.getAppointmentDate());
		System.out.println(appointment.getPatientId());		
		List cuslist=new ArrayList();	
		
		String query="select appointmentBooked from AppointmentBean where patientId=?";
		
		cuslist=ht.find(query,new Object[]{appointment.getPatientId()});	
		System.out.println("Query value is"+cuslist);
		System.out.println("STATUS BERFORE"+status);
		if(!(cuslist.isEmpty())){
		status=(String)cuslist.get(0);
		System.out.println(status);
		}
		//String status=appointment.getAppointmentBooked();
		 date=appointment.getAppointmentDate();
		 System.out.println("STATUS IS"+status);
		      if(status.equalsIgnoreCase("YES")){
				
					 appointment_coupon=null;
					 System.out.println("patient has already booked appointment");
				} 
		      else{
			 if(d==1){
				 System.out.println("IN D1");
				  if(coupon_d1_morn<=15&&s==1){
					  
					  appointment_coupon=d+date+s+coupon_d1_morn;
					  coupon_d1_morn=coupon_d1_morn+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D1 if 1");
				  }
				   if(coupon_d1_morn>15){
					  s=2;
					  coupon_d1_morn=1;
					  System.out.println("IN D1 if 2");
				  }
				   if(coupon_d1_aft<=15&&s==2){
					  appointment_coupon=d+date+s+coupon_d1_aft;
					  coupon_d1_aft=coupon_d1_aft+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D1 if 3");
				  }
				   if(coupon_d1_aft>15){
					   d=d+1;
					   coupon_d1_aft=1;
					   System.out.println("IN D1 if 4");
					   
				   }
			 }
			 else if(d==2){
				  if(coupon_d2_morn<=15&&s==1){
					  
					  appointment_coupon=d+date+s+coupon_d2_morn;
					  coupon_d2_morn=coupon_d2_morn+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D2 if 1");
				  }
				   if(coupon_d2_morn>15){
					  s=2;
					  coupon_d2_morn=1;
					  System.out.println("IN D2 if 2");
				  }
				   if(coupon_d2_aft<=15&&s==2){
					  appointment_coupon=d+date+s+coupon_d2_aft;
					  coupon_d2_aft=coupon_d2_aft+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D2 if 3");
				  }
				   if(coupon_d2_aft>15){
					   d=d+1;
					   coupon_d2_aft=1;
					   System.out.println("IN D2 if 4");
					   
				   }
			 }
			 else if(d==3){
				  if(coupon_d3_morn<=15&&s==1){
					  
					  appointment_coupon=d+date+s+coupon_d3_morn;
					  coupon_d3_morn=coupon_d3_morn+1;
					  appointment.setDoctorId(d);
					  d=1;
					  System.out.println("IN D3 if 1");
				  }
				   if(coupon_d3_morn>15){
					  s=2;
					  coupon_d3_morn=1;
					  System.out.println("IN D3 if 2");
				  }
				   if(coupon_d3_aft<=15&&s==2){
					  appointment_coupon=d+date+s+coupon_d3_aft;
					  coupon_d3_aft=coupon_d3_aft+1;
					  appointment.setDoctorId(d);
					  d=1;
					  System.out.println("IN D3 if 3");
				  }
				   if(coupon_d3_aft>15){
					   
					   coupon_d3_aft=1;
					   appointment_coupon=null;
					   System.out.println("IN D3 if 4");
					   
				   }
			 }
			System.out.println(appointment_coupon) ;
	  }
		 
		if(appointment_coupon!=null){
			System.out.println("in appointment coupon");
			appointment.setCouponNumber(appointment_coupon);
			appointment.setSlot(s);
			
			appointment.setAppointmentBooked("YES");
		    ht.save(appointment);
			
		}
		
		
		return  appointment_coupon;
	}
	@Override
	public String postponeAppointment(AppointmentBean appointment){
		String queryslot="select slot from AppointmentBean where patientId=?";
		List cuslist=new ArrayList();
		cuslist=ht.find(queryslot,new Object[]{appointment.getPatientId()});		
		int slot=(int)cuslist.get(0);
		System.out.println(slot);
		date=appointment.getAppointmentDate();
		if(slot==1){
			appointment.setAppointmentBooked("PENDING");
			if(d==1){
				 System.out.println("IN D1");
				  
				   if(coupon_d1_aft<=15&&(s==2||(appointment.getAppointmentBooked()).equalsIgnoreCase("PENDING"))){
					   int s1=s+1;
					  appointment_coupon=d+date+s1+coupon_d1_aft;
					  coupon_d1_aft=coupon_d1_aft+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D1 if 3");
				  }
				   if(coupon_d1_aft>15){
					   d=d+1;
					   coupon_d1_aft=1;
					   System.out.println("IN D1 if 4");
					   
				   }
			 }
			 else if(d==2){
				 
				   if(coupon_d2_aft<=15&&(s==2||(appointment.getAppointmentBooked()).equalsIgnoreCase("PENDING"))){
					   int s1=s+1;
					  appointment_coupon=d+date+s1+coupon_d2_aft;
					  coupon_d2_aft=coupon_d2_aft+1;
					  appointment.setDoctorId(d);
					  d=d+1;
					  System.out.println("IN D2 if 3");
				  }
				   if(coupon_d2_aft>15){
					   d=d+1;
					   coupon_d2_aft=1;
					   System.out.println("IN D2 if 4");
					   
				   }
			 }
			 else if(d==3){
				  
				   if(coupon_d3_aft<=15&&(s==2||(appointment.getAppointmentBooked()).equalsIgnoreCase("PENDING"))){
					   int s1=s+1;
					  appointment_coupon=d+date+s1+coupon_d3_aft;
					  coupon_d3_aft=coupon_d3_aft+1;
					  appointment.setDoctorId(d);
					  d=1;
					  System.out.println("IN D3 if 3");
				  }
				   if(coupon_d3_aft>15){
					   
					   coupon_d3_aft=1;
					   appointment_coupon=null;
					   System.out.println("IN D3 if 4");
					   
				   }
			 }
			System.out.println(appointment_coupon) ;
			
		}
		else{
			appointment_coupon=null;
			 System.out.println("patient cannot postpone");
		}
		if(appointment_coupon!=null){
			
			System.out.println("in appointment coupon of pending");
			ht.bulkUpdate("delete AppointmentBean where patientId=?",appointment.getPatientId());
			appointment.setCouponNumber(appointment_coupon);
			appointment.setSlot(2);
			
			appointment.setAppointmentBooked("YES");
		    ht.save(appointment);
			
		}
		
		
		return  appointment_coupon;
	}
	
	
}

