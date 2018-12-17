package org.razorpay.merchant.service.beans;

public class SessionDetails {
	private String sessionID;
	private String ipAddress;
	private String creationTime;
	private String creationType;
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getCreationType() {
		return creationType;
	}
	public void setCreationType(String creationType) {
		this.creationType = creationType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SessionDetails [sessionID=");
		builder.append(sessionID);
		builder.append(", ipAddress=");
		builder.append(ipAddress);
		builder.append(", creationTime=");
		builder.append(creationTime);
		builder.append(", creationType=");
		builder.append(creationType);
		builder.append("]");
		return builder.toString();
	}
	
	
}
