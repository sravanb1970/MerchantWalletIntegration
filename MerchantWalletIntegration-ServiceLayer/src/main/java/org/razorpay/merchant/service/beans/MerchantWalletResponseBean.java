package org.razorpay.merchant.service.beans;

public class MerchantWalletResponseBean {

	private StatusBlock status;
	private PaymentResponse paymentResponse;
	private TransactionDetailsResponse transactionDetailsResponse;
	public StatusBlock getStatus() {
		return status;
	}
	public void setStatus(StatusBlock status) {
		this.status = status;
	}
	public PaymentResponse getPaymentResponse() {
		return paymentResponse;
	}
	public void setPaymentResponse(PaymentResponse paymentResponse) {
		this.paymentResponse = paymentResponse;
	}
	public TransactionDetailsResponse getTransactionDetailsResponse() {
		return transactionDetailsResponse;
	}
	public void setTransactionDetailsResponse(TransactionDetailsResponse transactionDetailsResponse) {
		this.transactionDetailsResponse = transactionDetailsResponse;
	}
	@Override
	public String toString() {
		return "MerchantWalletResponseBean [status=" + status + ", paymentResponse=" + paymentResponse
				+ ", transactionDetailsResponse=" + transactionDetailsResponse + "]";
	}
	
	
}
