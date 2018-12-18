package org.razorpay.merchant.service.beans;

public class TransactionDetailsResponse {
	private String transactionDateTime;
	private String currencyCode;
	private String amount;
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransactionDetailsResponse [transactionDateTime=" + transactionDateTime + ", currencyCode="
				+ currencyCode + ", amount=" + amount + "]";
	}
	

}
