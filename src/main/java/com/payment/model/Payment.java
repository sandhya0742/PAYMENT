package com.payment.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String paymentMethod;
	private double dueAmount;
	private double amountPaid;
	private String transactionId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private java.util.Date transactionDate = new java.util.Date(System.currentTimeMillis());

	LocalDate checkInDate;
	private LocalDate checkOutDate;
	private int remainder;
	private double newDuesAmount;
	private boolean onBoard;
	// private double dueDuringOnBoard ;
	// private String occupancyType[] = { "Daily" , "Monthly" , "Regular" };
	private String occupancyType;
	private double currentRent;

	// Fields taking reference from guest-Master Data .
	private String bedId;
	private double securityDeposit = 5000;
	private String guestId; // (f k) from guestId 
	double defaultRent;
	
//Getters and setters .
	public double getDefaultRent() {
		return defaultRent;
	}

	public void setDefaultRent(double defaultRent) {
		this.defaultRent = defaultRent;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getDueAmount() {
		dueAmount = defaultRent + securityDeposit;
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public String getBedId() {
		return bedId;
	}

	public void setBedId(String bedId) {
		this.bedId = bedId;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public   void  setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

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

	public String getGuestId() {
		return guestId;
	}

	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getRemainder() {
		return remainder;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	public double getNewDuesAmount() {
		return newDuesAmount;
	}

	public void setNewDuesAmount(double newDuesAmount) {
		this.newDuesAmount = newDuesAmount;
	}

	public boolean isOnBoard() {
		return onBoard;
	}

	public void setOnBoard(boolean onBoard) {
		this.onBoard = onBoard;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public String getOccupancyType() {
		return occupancyType;
	}

	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}

	public double getCurrentRent() {
		return currentRent;
	}

	public void setCurrentRent(double currentRent) {
		this.currentRent = currentRent;
	}

//Default constructor .
	public Payment() {
		super();
	}

//Constructor using fields .
	public Payment(int paymentId, String paymentMethod, double dueAmount, double amountPaid, String transactionId,
			Date transactionDate, String guestId, double defaultRent, LocalDate checkInDate, LocalDate checkOutDate,
			String occupancyType, int remainder, double newDuesAmount, boolean onBoard, double securityDeposit,
			double dueDuringOnBOard, double currentRent, String bedId) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.dueAmount = dueAmount;
		this.amountPaid = amountPaid;
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.guestId = guestId;
		this.defaultRent = defaultRent;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.occupancyType = occupancyType;
		this.remainder = remainder;
		this.newDuesAmount = newDuesAmount;
		this.onBoard = onBoard;
		this.currentRent = currentRent;
		this.securityDeposit = securityDeposit;
		this.bedId = bedId;
	}
	

	/*
	 * public double getDueAmount() { LocalDate checkInDate = LocalDate.now() ; int
	 * remainder = checkInDate.getDayOfMonth();
	 * 
	 * double count=securityDeposit+defaultRent; dueAmount = count;
	 * 
	 * 
	 * if(remainder <30 && remainder > 1) {
	 * 
	 * dueAmount = (defaultRent/30)*remainder ; } if (onBoard == true ) {
	 * 
	 * newDuesAmount = dueAmount - amountPaid ; }
	 * 
	 */

	/*
	 * public double getAmountPaid() { if(occupancyType.toString().equals("Daily"))
	 * {
	 * 
	 * amountPaid = (defaultRent/30)* remainder ;
	 * 
	 * 
	 * }else if (occupancyType.toString().equals("Monthly")) {
	 * 
	 * amountPaid = defaultRent ;
	 * 
	 * }else if (occupancyType.toString().equals("Regular")){
	 * 
	 * amountPaid = defaultRent ; System.out.println("Exception"); } return
	 * amountPaid; }
	 */

	/*
	 * public double getDefaultRent() { if(occupancyType.toString().equals("Daily"))
	 * { defaultRent = defaultRent/30;
	 * 
	 * 
	 * }else if (occupancyType.toString().equals("Monthly")) { defaultRent =
	 * amountPaid;
	 * 
	 * }else if (occupancyType.toString().equals("Regular")){ defaultRent =
	 * amountPaid; } return defaultRent ; }
	 */
}
