package com.da.dao;

import com.da.beans.AppointmentBean;
import com.da.beans.PatientBean;

public interface BookAppointmentDao {
	public String bookAppointment(AppointmentBean appointment);
	public String postponeAppointment(AppointmentBean appointment);
}
