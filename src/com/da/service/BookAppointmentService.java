package com.da.service;

import com.da.beans.AppointmentBean;
import com.da.beans.PatientBean;

public interface BookAppointmentService {
	public String bookAppointment(AppointmentBean appointment);
	public String postponeAppointment(AppointmentBean appointment);
}
