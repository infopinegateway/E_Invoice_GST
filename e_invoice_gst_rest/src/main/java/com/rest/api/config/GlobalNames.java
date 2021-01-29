package com.rest.api.config;

public class GlobalNames {
	
	public final String SERVER_API_URL = "https://einv-apisandbox.nic.in";
	
	public final String POST_API_AUT = "/api/auth";
	public final String POST_GENERATE_IRN= "/api/Invoice";
	public final String POST_CANCEL_IRN = "/api/Cancel";			
	public final String GET_IRN_DETAILS = "/api/Invoice/irn/?irn=###";
	public final String POST_GEN_EWAYBILL_BY_IRN = "/api/einvewb/ewaybill";	
	public final String GET_GSTIN_DETAILS = "/eivital/v1.03/Master/gstin/?GSTIN=###";
	public final String POST_EWAYBILL_CANCEL ="/ewayapi/";
	public final String GET_GSTIN_CP_DETAILS = "/eivital/v1.03/Master/syncgstin/?GSTIN=###";
	public final String GET_EWAY_BILL_BY_IRN = "/eiewb/v1.03/ewaybill/irn/?irn_no=###";
	public final String GET_IRN_DOC_DETAILS = "/irnbydocdetails?doctype=###&docnum=$$$&docdate=***";
	
	
	private static GlobalNames globalNames_Instance = null; 
	 
	public static GlobalNames GlobalNames() {
		if(globalNames_Instance == null) {
			globalNames_Instance = new GlobalNames();
		}
		return globalNames_Instance;
	}

}
