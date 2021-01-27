package com.rest.json.pojo.irn.cancel;

public class Resp_Cancel_IRN {
	private String Status;
	private String Data =null;
	private String Irn;
	private String CnlDate;
	private String ErrorDetails;
	private String InfoDtls;
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getIrn() {
		return Irn;
	}
	public void setIrn(String irn) {
		Irn = irn;
	}
	public String getCnlDate() {
		return CnlDate;
	}
	public void setCnlDate(String cnlDate) {
		CnlDate = cnlDate;
	}
	public String getErrorDetails() {
		return ErrorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		ErrorDetails = errorDetails;
	}
	public String getInfoDtls() {
		return InfoDtls;
	}
	public void setInfoDtls(String infoDtls) {
		InfoDtls = infoDtls;
	}	
	
}
