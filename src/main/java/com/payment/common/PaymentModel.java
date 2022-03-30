package com.payment.common;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaymentModel {

	private String transactionId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private java.util.Date transactionDate = new java.util.Date(System.currentTimeMillis());

	
	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public java.util.Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(java.util.Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	public PaymentModel() {
		// TODO Auto-generated constructor stub
	}

}
