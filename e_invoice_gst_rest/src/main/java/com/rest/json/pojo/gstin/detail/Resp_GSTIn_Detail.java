package com.rest.json.pojo.gstin.detail;

public class Resp_GSTIn_Detail {

	private String Status;
	private String data;
	private String rek;
	private String hmac;
	private String ErrorDetails = null;
	private String InfoDtls;	
	private String Gstin;
	private String TradeName;
	private String LegalName;
	private String AddrBnm;
	private String AddrBno;
	private String AddrFlno;
	private String AddrSt;
	private String AddrLoc;
	private float StateCode;
	private float AddrPncd;
	private String TxpType;	
	private String BlkStatus = null;

	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRek() {
		return rek;
	}
	public void setRek(String rek) {
		this.rek = rek;
	}
	public String getHmac() {
		return hmac;
	}
	public void setHmac(String hmac) {
		this.hmac = hmac;
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
	public String getGstin() {
		return Gstin;
	}
	public void setGstin(String gstin) {
		Gstin = gstin;
	}
	public String getTradeName() {
		return TradeName;
	}
	public void setTradeName(String tradeName) {
		TradeName = tradeName;
	}
	public String getLegalName() {
		return LegalName;
	}
	public void setLegalName(String legalName) {
		LegalName = legalName;
	}
	public String getAddrBnm() {
		return AddrBnm;
	}
	public void setAddrBnm(String addrBnm) {
		AddrBnm = addrBnm;
	}
	public String getAddrBno() {
		return AddrBno;
	}
	public void setAddrBno(String addrBno) {
		AddrBno = addrBno;
	}
	public String getAddrFlno() {
		return AddrFlno;
	}
	public void setAddrFlno(String addrFlno) {
		AddrFlno = addrFlno;
	}
	public String getAddrSt() {
		return AddrSt;
	}
	public void setAddrSt(String addrSt) {
		AddrSt = addrSt;
	}
	public String getAddrLoc() {
		return AddrLoc;
	}
	public void setAddrLoc(String addrLoc) {
		AddrLoc = addrLoc;
	}
	public float getStateCode() {
		return StateCode;
	}
	public void setStateCode(float stateCode) {
		StateCode = stateCode;
	}
	public float getAddrPncd() {
		return AddrPncd;
	}
	public void setAddrPncd(float addrPncd) {
		AddrPncd = addrPncd;
	}
	public String getTxpType() {
		return TxpType;
	}
	public void setTxpType(String txpType) {
		TxpType = txpType;
	}

	public String getBlkStatus() {
		return BlkStatus;
	}
	public void setBlkStatus(String blkStatus) {
		BlkStatus = blkStatus;
	}
	
	
	
}
