package com.rest.json.pojo.irn.generate;

import java.util.ArrayList;

public class Req_RefDtls {

	private String InvRm;
	Req_DocPerdDtls DocPerdDtlsObject;
	ArrayList < Object > PrecDocDtls = new ArrayList < Object > ();
	ArrayList < Object > ContrDtls = new ArrayList < Object > ();
	
	public String getInvRm() {
		return InvRm;
	}
	public void setInvRm(String invRm) {
		InvRm = invRm;
	}
	public Req_DocPerdDtls getDocPerdDtlsObject() {
		return DocPerdDtlsObject;
	}
	public void setDocPerdDtlsObject(Req_DocPerdDtls docPerdDtlsObject) {
		DocPerdDtlsObject = docPerdDtlsObject;
	}
	
	
}
