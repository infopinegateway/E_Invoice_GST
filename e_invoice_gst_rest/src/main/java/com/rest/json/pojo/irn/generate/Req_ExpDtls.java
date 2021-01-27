package com.rest.json.pojo.irn.generate;

public class Req_ExpDtls {

	private String ShipBNo;
	private String ShipBDt;
	private String Port;
	private String RefClm;
	private String ForCur;
	private String CntCode;
	private String ExpDuty = null;
	
	public String getShipBNo() {
		return ShipBNo;
	}
	public void setShipBNo(String shipBNo) {
		ShipBNo = shipBNo;
	}
	public String getShipBDt() {
		return ShipBDt;
	}
	public void setShipBDt(String shipBDt) {
		ShipBDt = shipBDt;
	}
	public String getPort() {
		return Port;
	}
	public void setPort(String port) {
		Port = port;
	}
	public String getRefClm() {
		return RefClm;
	}
	public void setRefClm(String refClm) {
		RefClm = refClm;
	}
	public String getForCur() {
		return ForCur;
	}
	public void setForCur(String forCur) {
		ForCur = forCur;
	}
	public String getCntCode() {
		return CntCode;
	}
	public void setCntCode(String cntCode) {
		CntCode = cntCode;
	}
	public String getExpDuty() {
		return ExpDuty;
	}
	public void setExpDuty(String expDuty) {
		ExpDuty = expDuty;
	}
	 
}
