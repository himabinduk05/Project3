package com.da.service;

import java.util.List;

import com.da.beans.AppointmentBean;
import com.da.dao.ViewPatientDaoImplementation;

public class ViewPatientServiceImplementation implements ViewPatientService{
	private ViewPatientDaoImplementation viewpatientdao;
	public void setViewpatientdao(ViewPatientDaoImplementation viewpatientdao) {
		this.viewpatientdao = viewpatientdao;
	}
	@Override
	public List viewPatientDetails(AppointmentBean appointment){
		System.out.println("IN view patient SERVICE IMPLE");
		return viewpatientdao.viewPatientDetails(appointment);
	}
}
