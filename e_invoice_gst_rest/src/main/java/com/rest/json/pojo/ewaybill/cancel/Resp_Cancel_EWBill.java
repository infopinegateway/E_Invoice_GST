package com.rest.json.pojo.ewaybill.cancel;

public class Resp_Cancel_EWBill {

	
	private String Data = null;
	private String Status;
	private String ewayBillNo;
	private String cancelDate;
	private String ErrorCode;
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getEwayBillNo() {
		return ewayBillNo;
	}
	public void setEwayBillNo(String ewayBillNo) {
		this.ewayBillNo = ewayBillNo;
	}
	public String getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	
}
