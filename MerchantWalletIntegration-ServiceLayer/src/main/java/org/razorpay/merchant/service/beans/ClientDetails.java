package org.razorpay.merchant.service.beans;

public class ClientDetails {
	private String clientID;
	private String clientName;
	private String clientItem;
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientItem() {
		return clientItem;
	}
	public void setClientItem(String clientItem) {
		this.clientItem = clientItem;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientDetails [clientID=");
		builder.append(clientID);
		builder.append(", clientName=");
		builder.append(clientName);
		builder.append(", clientItem=");
		builder.append(clientItem);
		builder.append("]");
		return builder.toString();
	}
	
	
}
