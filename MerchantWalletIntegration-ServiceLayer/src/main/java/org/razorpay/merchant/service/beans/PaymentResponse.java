package org.razorpay.merchant.service.beans;

public class PaymentResponse {
private String paymentType;
private String protectionEligibility;
private String authorizationCode;
private String paymentReason;
private String pendingReason;
private String errorCode;
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public String getProtectionEligibility() {
	return protectionEligibility;
}
public void setProtectionEligibility(String protectionEligibility) {
	this.protectionEligibility = protectionEligibility;
}
public String getAuthorizationCode() {
	return authorizationCode;
}
public void setAuthorizationCode(String authorizationCode) {
	this.authorizationCode = authorizationCode;
}
public String getPaymentReason() {
	return paymentReason;
}
public void setPaymentReason(String paymentReason) {
	this.paymentReason = paymentReason;
}
public String getPendingReason() {
	return pendingReason;
}
public void setPendingReason(String pendingReason) {
	this.pendingReason = pendingReason;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
@Override
public String toString() {
	return "PaymentResponse [paymentType=" + paymentType + ", protectionEligibility=" + protectionEligibility
			+ ", authorizationCode=" + authorizationCode + ", paymentReason=" + paymentReason + ", pendingReason="
			+ pendingReason + ", errorCode=" + errorCode + "]";
}

}
