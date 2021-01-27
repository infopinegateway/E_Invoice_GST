package com.rest.json.pojo.irn.cancel;

public class Req_Cancel_IRN {
	private String Data;
	private String Irn;
	private String CnlRsn;
	private String CnlRem;	
	
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
	public String getCnlRsn() {
		return CnlRsn;
	}
	public void setCnlRsn(String cnlRsn) {
		CnlRsn = cnlRsn;
	}
	public String getCnlRem() {
		return CnlRem;
	}
	public void setCnlRem(String cnlRem) {
		CnlRem = cnlRem;
	}

}
