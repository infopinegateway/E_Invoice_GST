package com.rest.json.pojo.resauth;

public class IO_AuthToken {

	private String str_UserName;
	private String str_UserPwd;
	private String str_AppKey;
	private boolean bln_ForceRefreshAccessToken;
	private String str_ClientId;	
	private String str_AuthToken;
	private String str_Sek;
	private String str_TokenExpiry;
	
	//Getters
	public String getStr_UserName() {
		return str_UserName;
	}
	public String getStr_UserPwd() {
		return str_UserPwd;
	}
	public String getStr_AppKey() {
		return str_AppKey;
	}
	public boolean isBln_ForceRefreshAccessToken() {
		return bln_ForceRefreshAccessToken;
	}
	public String getStr_ClientId() {
		return str_ClientId;
	}
	public String getStr_AuthToken() {
		return str_AuthToken;
	}
	public String getStr_Sek() {
		return str_Sek;
	}
	public String getStr_TokenExpiry() {
		return str_TokenExpiry;
	}
	
	//Setters
	public void setStr_UserName(String str_UserName) {
		this.str_UserName = str_UserName;
	}
	public void setStr_UserPwd(String str_UserPwd) {
		this.str_UserPwd = str_UserPwd;
	}
	public void setStr_AppKey(String str_AppKey) {
		this.str_AppKey = str_AppKey;
	}
	public void setBln_ForceRefreshAccessToken(boolean bln_ForceRefreshAccessToken) {
		this.bln_ForceRefreshAccessToken = bln_ForceRefreshAccessToken;
	}
	public void setStr_ClientId(String str_ClientId) {
		this.str_ClientId = str_ClientId;
	}
	public void setStr_AuthToken(String str_AuthToken) {
		this.str_AuthToken = str_AuthToken;
	}
	public void setStr_Sek(String str_Sek) {
		this.str_Sek = str_Sek;
	}
	public void setStr_TokenExpiry(String str_TokenExpiry) {
		this.str_TokenExpiry = str_TokenExpiry;
	}
	
	
	 
}
