package org.razorpay.merchant.service.beans;

public class UserDetails {
	private String userName;
	private String firstName;
	private String lastName;
	private String eMail;
	private String payerID;
	private String mobileNo;
	private String servicePayerID;
	private String address;
	private String currency;
	private String userDOB;
	
	public String getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPayerID() {
		return payerID;
	}
	public void setPayerID(String payerID) {
		this.payerID = payerID;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getServicePayerID() {
		return servicePayerID;
	}
	public void setServicePayerID(String servicePayerID) {
		this.servicePayerID = servicePayerID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDetails [userName=");
		builder.append(userName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", eMail=");
		builder.append(eMail);
		builder.append(", payerID=");
		builder.append(payerID);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", servicePayerID=");
		builder.append(servicePayerID);
		builder.append(", address=");
		builder.append(address);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", userDOB=");
		builder.append(userDOB);
		builder.append("]");
		return builder.toString();
	}
	
	
}
