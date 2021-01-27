package com.rest.json.pojo.ewaybill.generate;

public class Resp_EWBill_Generate {

	private float EwbNo;
	private String EwbDt;
	private String EwbValidTill;
	private String Remarks;
	private String Status;
	private String ErrorDetails;
	private String Data;
	private String InfoDtls;
	
	public float getEwbNo() {
		return EwbNo;
	}
	public void setEwbNo(float ewbNo) {
		EwbNo = ewbNo;
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
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
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
	public String getInfoDtls() {
		return InfoDtls;
	}
	public void setInfoDtls(String infoDtls) {
		InfoDtls = infoDtls;
	}

}
