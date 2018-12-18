package org.razorpay.merchant.service.beans;

public class StatusBlock {
private String responseMessage;
private String status;
public String getResponseMessage() {
	return responseMessage;
}
public void setResponseMessage(String responseMessage) {
	this.responseMessage = responseMessage;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("StatusBlock [responseMessage=");
	builder.append(responseMessage);
	builder.append(", status=");
	builder.append(status);
	builder.append("]");
	return builder.toString();
}
 


}
