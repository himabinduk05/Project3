package com.da.service;

import com.da.beans.AppointmentBean;
import com.da.beans.PatientBean;
import com.da.dao.BookAppointmentDaoImplementation;

public class BookAppointmentServiceImplementation implements BookAppointmentService{
	   private BookAppointmentDaoImplementation bookappointmentdao;

	public void setBookappointmentdao(
			BookAppointmentDaoImplementation bookappointmentdao) {
		this.bookappointmentdao = bookappointmentdao;
	}
	@Override
	public String bookAppointment(AppointmentBean appointment){
		System.out.println("IN BOOK APPOINTMENT SERVICE IMPLE");
		return bookappointmentdao.bookAppointment(appointment);
	}
	@Override
	public String postponeAppointment(AppointmentBean appointment){
		System.out.println("IN postpone APPOINTMENT SERVICE IMPLE");
		return bookappointmentdao.postponeAppointment(appointment);
	}
	}
