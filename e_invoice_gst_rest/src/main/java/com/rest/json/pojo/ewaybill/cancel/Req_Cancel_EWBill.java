package com.rest.json.pojo.ewaybill.cancel;

public class Req_Cancel_EWBill {

	private String Action ="CANEWB";
	private String Data = null;
	private long ewbNo;
	private int cancelRsnCode;
	private String cancelRmrk;
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public long getEwbNo() {
		return ewbNo;
	}
	public void setEwbNo(long ewbNo) {
		this.ewbNo = ewbNo;
	}
	public int getCancelRsnCode() {
		return cancelRsnCode;
	}
	public void setCancelRsnCode(int cancelRsnCode) {
		this.cancelRsnCode = cancelRsnCode;
	}
	public String getCancelRmrk() {
		return cancelRmrk;
	}
	public void setCancelRmrk(String cancelRmrk) {
		this.cancelRmrk = cancelRmrk;
	}

}
