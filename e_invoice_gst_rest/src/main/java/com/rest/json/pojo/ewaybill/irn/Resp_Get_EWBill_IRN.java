package com.rest.json.pojo.ewaybill.irn;

public class Resp_Get_EWBill_IRN {

	private float Status;
	private String ErrorDetails = null;
	private String Data=null;
	private String Alert = null;	 
	private String InfoDtls;	 
	private float EwbNo;
	private String GenGstin;
	private String EwbDt;
	private String EwbValidTill;
	public float getStatus() {
		return Status;
	}
	public void setStatus(float status) {
		Status = status;
	}
	public String getErrorDetails() {
		return ErrorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		ErrorDetails = errorDetails;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getAlert() {
		return Alert;
	}
	public void setAlert(String alert) {
		Alert = alert;
	}
	public String getInfoDtls() {
		return InfoDtls;
	}
	public void setInfoDtls(String infoDtls) {
		InfoDtls = infoDtls;
	}
	public float getEwbNo() {
		return EwbNo;
	}
	public void setEwbNo(float ewbNo) {
		EwbNo = ewbNo;
	}
	public String getGenGstin() {
		return GenGstin;
	}
	public void setGenGstin(String genGstin) {
		GenGstin = genGstin;
	}
	public String getEwbDt() {
		return EwbDt;
	}
	public void setEwbDt(String ewbDt) {
		EwbDt = ewbDt;
	}
	public String getEwbValidTill() {
		return EwbValidTill;
	}
	public void setEwbValidTill(String ewbValidTill) {
		EwbValidTill = ewbValidTill;
	}
	
	
}
