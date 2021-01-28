package com.rest.api.config;

import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class ControllerAPI {

	private final String SERVER_API_URI = "https://einv-apisandbox.nic.in";
	public StringBuffer bufferURL = null;	
	private int responsecode =0;
	private StringBuffer inline =null;
	
	public ControllerAPI() { }
	
	public void responseAPI(String urlPath, String urlMethod) {
		inline = new StringBuffer("");
		try {
			System.out.println("urlPath "+urlPath);
			URL url = new URL(urlPath);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod(urlMethod.toUpperCase()); 
			conn.connect();
			responsecode = conn.getResponseCode();
			
			Scanner sc = new Scanner(url.openStream());			
			while (sc.hasNext()){
				inline.append(sc.next());				
			}
			sc.close();
			
			System.out.println("The contents \n"+ inline.toString());
			
			if(urlMethod.equalsIgnoreCase("GET")) {
				if(responsecode != 200) throw new RuntimeException("HTTPResponseCode"+ responsecode);
				else{
					try {
						JSONParser parse = new JSONParser(); 
						JSONObject jobj = (JSONObject)parse.parse(inline.toString());
						if(Integer.parseInt(jobj.get("Status").toString()) ==0) {
							System.out.println("Error message got");
							JSONArray jsonarr_1 = (JSONArray) jobj.get("ErrorDetails"); 
							System.out.println("Size of the Response ErrorDetails "+ jsonarr_1.size());
						}else {
							JSONArray jsonarr_1 = (JSONArray) jobj.get("Data"); 
							System.out.println("Size of the Response Data "+ jsonarr_1.size());
							
						}
						
					}catch(Exception e) {System.out.println("Exception on parsing json object"); }
				}
			}
			
		}catch (Exception  ex){ System.out.println("###" +ex.toString()); }
	}
	
	public void getGSTINdetails(String gstInvNoCommonPortal) {
		bufferURL = new StringBuffer(SERVER_API_URI+"/eivital/v1.03/Master/syncgstin/?GSTIN="+gstInvNoCommonPortal);				
		responseAPI(bufferURL.toString(), "get");
	}
	
	
	public static void main(String[] args) {
				
		new ControllerAPI().getGSTINdetails("33GSPTN1882G1Z3");
	}
	 
}
