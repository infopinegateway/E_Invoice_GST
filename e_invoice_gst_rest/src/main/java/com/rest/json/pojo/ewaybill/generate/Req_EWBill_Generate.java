package com.rest.json.pojo.ewaybill.generate;

public class Req_EWBill_Generate {

	 private String Irn;
	 private float Distance;
	 private String TransMode;
	 private String TransId;
	 private String TransName;
	 private String TransDocDt;
	 private String TransDocNo;
	 private String VehNo;
	 private String VehType;
	 private String Data;	  
	 Req_Exp_Ship_Dtls ExpShipDtlsObject;
	 Req_DispDtls DispDtlsObject;
	 
	public String getIrn() {
		return Irn;
	}
	public void setIrn(String irn) {
		Irn = irn;
	}
	public float getDistance() {
		return Distance;
	}
	public void setDistance(float distance) {
		Distance = distance;
	}
	public String getTransMode() {
		return TransMode;
	}
	public void setTransMode(String transMode) {
		TransMode = transMode;
	}
	public String getTransId() {
		return TransId;
	}
	public void setTransId(String transId) {
		TransId = transId;
	}
	public String getTransName() {
		return TransName;
	}
	public void setTransName(String transName) {
		TransName = transName;
	}
	public String getTransDocDt() {
		return TransDocDt;
	}
	public void setTransDocDt(String transDocDt) {
		TransDocDt = transDocDt;
	}
	public String getTransDocNo() {
		return TransDocNo;
	}
	public void setTransDocNo(String transDocNo) {
		TransDocNo = transDocNo;
	}
	public String getVehNo() {
		return VehNo;
	}
	public void setVehNo(String vehNo) {
		VehNo = vehNo;
	}
	public String getVehType() {
		return VehType;
	}
	public void setVehType(String vehType) {
		VehType = vehType;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public Req_Exp_Ship_Dtls getExpShipDtlsObject() {
		return ExpShipDtlsObject;
	}
	public void setExpShipDtlsObject(Req_Exp_Ship_Dtls expShipDtlsObject) {
		ExpShipDtlsObject = expShipDtlsObject;
	}
	public Req_DispDtls getDispDtlsObject() {
		return DispDtlsObject;
	}
	public void setDispDtlsObject(Req_DispDtls dispDtlsObject) {
		DispDtlsObject = dispDtlsObject;
	}

}
