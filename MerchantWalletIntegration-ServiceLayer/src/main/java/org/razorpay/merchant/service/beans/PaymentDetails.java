package org.razorpay.merchant.service.beans;

public class PaymentDetails {
	private String paymentID;
	private String paymentMethod;
	private String paymentProvider;
	private String paymentChannel;
	private String amount;
	private String baseAmount;
	
	
	
	
	public String getPaymentID() {
		return paymentID;
	}




	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}




	public String getPaymentMethod() {
		return paymentMethod;
	}




	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}




	public String getPaymentProvider() {
		return paymentProvider;
	}




	public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}




	public String getPaymentChannel() {
		return paymentChannel;
	}




	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}




	public String getAmount() {
		return amount;
	}




	public void setAmount(String amount) {
		this.amount = amount;
	}




	public String getBaseAmount() {
		return baseAmount;
	}




	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentDetails [paymentID=");
		builder.append(paymentID);
		builder.append(", paymentMethod=");
		builder.append(paymentMethod);
		builder.append(", paymentProvider=");
		builder.append(paymentProvider);
		builder.append(", paymentChannel=");
		builder.append(paymentChannel);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", baseAmount=");
		builder.append(baseAmount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
