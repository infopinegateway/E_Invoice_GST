package com.rest.json.pojo.irn.generate;

import java.util.ArrayList;

public class Req_Generate_IRN {
	
	private String Version;
	Req_TranDtls TranDtlsObject;
	Req_DocDtls DocDtlsObject;
	Req_SellerDtls SellerDtlsObject;
	Req_BuyerDtls BuyerDtlsObject;
	Req_DispDtls DispDtlsObject;
	Req_ShipDtls ShipDtlsObject;	
	Req_ValDtls ValDtlsObject;
	Req_PayDtls PayDtlsObject;
	Req_RefDtls RefDtlsObject;	
	Req_ExpDtls ExpDtlsObject;
	Req_EwbDtls EwbDtlsObject;
	
	ArrayList < Object > ItemList = new ArrayList < Object > ();
	ArrayList < Object > AddlDocDtls = new ArrayList < Object > ();
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public Req_TranDtls getTranDtlsObject() {
		return TranDtlsObject;
	}
	public void setTranDtlsObject(Req_TranDtls tranDtlsObject) {
		TranDtlsObject = tranDtlsObject;
	}
	public Req_DocDtls getDocDtlsObject() {
		return DocDtlsObject;
	}
	public void setDocDtlsObject(Req_DocDtls docDtlsObject) {
		DocDtlsObject = docDtlsObject;
	}
	public Req_SellerDtls getSellerDtlsObject() {
		return SellerDtlsObject;
	}
	public void setSellerDtlsObject(Req_SellerDtls sellerDtlsObject) {
		SellerDtlsObject = sellerDtlsObject;
	}
	public Req_BuyerDtls getBuyerDtlsObject() {
		return BuyerDtlsObject;
	}
	public void setBuyerDtlsObject(Req_BuyerDtls buyerDtlsObject) {
		BuyerDtlsObject = buyerDtlsObject;
	}
	public Req_DispDtls getDispDtlsObject() {
		return DispDtlsObject;
	}
	public void setDispDtlsObject(Req_DispDtls dispDtlsObject) {
		DispDtlsObject = dispDtlsObject;
	}
	public Req_ShipDtls getShipDtlsObject() {
		return ShipDtlsObject;
	}
	public void setShipDtlsObject(Req_ShipDtls shipDtlsObject) {
		ShipDtlsObject = shipDtlsObject;
	}
	public Req_ValDtls getValDtlsObject() {
		return ValDtlsObject;
	}
	public void setValDtlsObject(Req_ValDtls valDtlsObject) {
		ValDtlsObject = valDtlsObject;
	}
	public Req_PayDtls getPayDtlsObject() {
		return PayDtlsObject;
	}
	public void setPayDtlsObject(Req_PayDtls payDtlsObject) {
		PayDtlsObject = payDtlsObject;
	}
	public Req_RefDtls getRefDtlsObject() {
		return RefDtlsObject;
	}
	public void setRefDtlsObject(Req_RefDtls refDtlsObject) {
		RefDtlsObject = refDtlsObject;
	}
	public Req_ExpDtls getExpDtlsObject() {
		return ExpDtlsObject;
	}
	public void setExpDtlsObject(Req_ExpDtls expDtlsObject) {
		ExpDtlsObject = expDtlsObject;
	}
	public Req_EwbDtls getEwbDtlsObject() {
		return EwbDtlsObject;
	}
	public void setEwbDtlsObject(Req_EwbDtls ewbDtlsObject) {
		EwbDtlsObject = ewbDtlsObject;
	}

	
}
