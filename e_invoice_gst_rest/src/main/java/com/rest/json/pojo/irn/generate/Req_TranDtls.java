package com.rest.json.pojo.irn.generate;

public class Req_TranDtls {

	private String TaxSch;
	private String SupTyp;
	private String RegRev;
	private String EcmGstin = null;
	private String IgstOnIntra;
	
	//Getter 
	public String getTaxSch() {
		return TaxSch;
	}
	public String getSupTyp() {
		return SupTyp;
	}
	public String getRegRev() {
		return RegRev;
	}
	public String getEcmGstin() {
		return EcmGstin;
	}
	public String getIgstOnIntra() {
		return IgstOnIntra;
	}
	
	//Setter
	public void setTaxSch(String taxSch) {
		TaxSch = taxSch;
	}
	public void setSupTyp(String supTyp) {
		SupTyp = supTyp;
	}
	public void setRegRev(String regRev) {
		RegRev = regRev;
	}
	public void setEcmGstin(String ecmGstin) {
		EcmGstin = ecmGstin;
	}
	public void setIgstOnIntra(String igstOnIntra) {
		IgstOnIntra = igstOnIntra;
	}
	
	
	
}
