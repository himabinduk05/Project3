package com.da.beans;

public class RegistrationBean {
		private String patientId;
		private String patientName;
		private String patientGender;
		private String patientAddress;
		private String patientPhone;
		private String patientAge;
		
		public RegistrationBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public RegistrationBean(String patientId, String patientName,
				String patientGender, String patientAddress,
				String patientPhone, String patientAge) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.patientGender = patientGender;
			this.patientAddress = patientAddress;
			this.patientPhone = patientPhone;
			this.patientAge = patientAge;
		}



		
		
		
		public String getPatientId() {
			return patientId;
		}

		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public String getPatientGender() {
			return patientGender;
		}

		public void setPatientGender(String patientGender) {
			this.patientGender = patientGender;
		}

		public String getPatientAddress() {
			return patientAddress;
		}

		public void setPatientAddress(String patientAddress) {
			this.patientAddress = patientAddress;
		}

		public String getPatientPhone() {
			return patientPhone;
		}

		public void setPatientPhone(String patientPhone) {
			this.patientPhone = patientPhone;
		}

		public String getPatientAge() {
			return patientAge;
		}

		public void setPatientAge(String patientAge) {
			this.patientAge = patientAge;
		}

		
		
		
		
		
		
	}


