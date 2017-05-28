package com.da.dao;

import java.util.List;

import com.da.beans.AppointmentBean;

public interface ViewPatientDao {
	public List viewPatientDetails(AppointmentBean appointment);
}
