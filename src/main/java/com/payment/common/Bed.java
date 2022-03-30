package com.payment.common;

//import javax.persistence.Column;

public class Bed {

	private double defaultRent;

	    private String bedId;
	
	    //CONSTRUCTOR USING ARGUMENTS .
	    public Bed(String bedId, double defaultRent) {
			super();
			this.bedId = bedId;
			this.defaultRent = defaultRent;
		}

	    //GETTERS AND SETTERS 
		public String getBedId() {
			return bedId;
		}

		public void setBedId(String bedId) {
			this.bedId = bedId;
		}

		public double getDefaultRent() {
			return defaultRent;
		}

		public void setDefaultRent(double defaultRent) {
			this.defaultRent = defaultRent;
		}
		
		public Bed () {
			super ();
			
		}

}