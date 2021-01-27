package com.rest.json.pojo.resauth;

public class Resp_AuthToken {

	private float Status;
	IO_AuthToken DataObject;
	private String ErrorDetails = null;
	private String InfoDtls;
	
	public float getStatus() {
		return Status;
	}
	public void setStatus(float status) {
		Status = status;
	}
	public IO_AuthToken getDataObject() {
		return DataObject;
	}
	public void setDataObject(IO_AuthToken dataObject) {
		DataObject = dataObject;
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
