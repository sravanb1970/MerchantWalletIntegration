package org.razorpay.merchant.service.beans;

public class MerchantWalletRequestBeans {
	private CCDetails ccDetails;
	private UserDetails userDetails;
	private ClientDetails clientDetails;
	private SessionDetails sessionDetails;
	private PaymentDetails paymentDetails;
	
	
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public CCDetails getCcDetails() {
		return ccDetails;
	}
	public void setCcDetails(CCDetails ccDetails) {
		this.ccDetails = ccDetails;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public ClientDetails getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}
	public SessionDetails getSessionDetails() {
		return sessionDetails;
	}
	public void setSessionDetails(SessionDetails sessionDetails) {
		this.sessionDetails = sessionDetails;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MerchantWalletRequestBeans [ccDetails=");
		builder.append(ccDetails);
		builder.append(", userDetails=");
		builder.append(userDetails);
		builder.append(", clientDetails=");
		builder.append(clientDetails);
		builder.append(", sessionDetails=");
		builder.append(sessionDetails);
		builder.append(", paymentDetails=");
		builder.append(paymentDetails);
		builder.append("]");
		return builder.toString();
	}
	
	
}
