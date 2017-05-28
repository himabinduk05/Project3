package com.da.beans;

public class AppointmentBean {
      private String couponNumber;
      public AppointmentBean() {
		super();
	}
	private int slot;
      private int doctorId;
      private String appointmentDate;
      private long patientId;
      private String appointmentBooked;
      public String getAppointmentBooked() {
		return appointmentBooked;
	}

	public void setAppointmentBooked(String appointmentBooked) {
		this.appointmentBooked = appointmentBooked;
	}

	public AppointmentBean(String couponNumber, int slot, int doctorId,
			String appointmentDate, long patientId,String appointmentBooked) {
		super();
		this.couponNumber = couponNumber;
		this.slot = slot;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.patientId = patientId;
		this.appointmentBooked=appointmentBooked;
	}
	
      public String getCouponNumber() {
		return couponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
      
      
       
}
