package com.rest.api.config;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ControllerAPI {

	
	public StringBuffer bufferURL = null;	
	private int responsecode =0;
	private StringBuffer inline =null;
	private StringBuffer dataBuffer = null;
	private StringBuffer errorBuffer = null;
	
	
	public void responseAPI(String urlPath, String urlMethod) {
		inline = new StringBuffer("");
		try {
				
			if(urlMethod.equalsIgnoreCase("GET")) {
				
				URL url = new URL(urlPath);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.setRequestMethod(urlMethod.toUpperCase());
				conn.connect();			
				responsecode = conn.getResponseCode();
				
				Scanner sc = new Scanner(url.openStream());			
				while (sc.hasNext()){ inline.append(sc.next()); }
				sc.close();
				
				System.out.println("The contents \n"+ inline.toString());
				
				if(responsecode != 200) throw new RuntimeException("HTTPResponseCode"+ responsecode);
				else{
					try {
						JSONParser parse = new JSONParser(); 
						JSONObject jobj = (JSONObject)parse.parse(inline.toString());
						
						if(Integer.parseInt(jobj.get("Status").toString()) ==0) {							
							
							JSONArray jsonarr_1 = (JSONArray) jobj.get("ErrorDetails");
							jobj = (JSONObject)jsonarr_1.get(0);
							
							System.out.println("Get Response Error: " + jobj.get("ErrorCode").toString()+" == "+jobj.get("ErrorMessage").toString());
							
						} else {
							
							JSONArray jsonarr_1 = (JSONArray) jobj.get("Data"); 
							System.out.println("Size of the Response Data "+ jsonarr_1.size());							
						}
						
					}catch(Exception e) {System.out.println("Exception on parsing json object"); }
				}
			}else if(urlMethod.equalsIgnoreCase("POST")) {
				
				HttpClient httpClient = new DefaultHttpClient();
				HttpResponse response;
				try {
					JSONObject jsonParam = new JSONObject();
					jsonParam.put("action", "ACCESSTOKEN"); 
					jsonParam.put("username", "nictexxst");
					jsonParam.put("password", "abcdef"); 
					jsonParam.put("app_key", "e1d65bgSeTrTatc7atLhKWyUbM/ekfbAWu2dFMfyNuYS+ ==");
					
					HttpPost request = new HttpPost(urlPath.toString());
				    StringEntity params = new StringEntity(jsonParam.toString());
				    params.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
				    //request.addHeader("content-type", "application/json");
				    request.setEntity(params);
				    response = httpClient.execute(request);
				    if (response != null) {
				    	 //InputStream in = response.getEntity().getContent();
				    	System.out.println("Post contents :\n"+response.getEntity().getContent());
				    }
				    	/*				
					if(responsecode != 200) throw new RuntimeException("HTTPResponseCode"+ responsecode);
					else{
						System.out.println("Post contents :\n"+inline.toString());
					}
					*/
				} catch(Exception ex ) {
					System.out.println("Post Exception "+ ex.toString());
				}
				
			}
			
		} catch (Exception  ex){ System.out.println("###" +ex.toString()); }
	}
	
	
	/*
	 * 1 - Default to send Authentication response from API portal 
	 * */

	public void post_Authendicate(String uName, String uPwd, String uAppKey) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().POST_API_AUT);
		responseAPI(bufferURL.toString(),"POST");
	}
	

	/*
	 * 2 - To Generate IRN Details
	 * */
	public void post_GenerateIRN(String argJSONData, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().POST_GENERATE_IRN);
		responseAPI(bufferURL.toString(),"POST");
	}
	
	/*
	 * 3 - To Cancel IRN Details
	 * */
	public void post_CancelIRN(String argJSONData, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().POST_CANCEL_IRN);
		responseAPI(bufferURL.toString(),"POST");
	}
	
	
	/*
	 * 4 - To Get IRN Details to pass IRN Number to the API Portal
	 * */
	public void get_IRNDetails(String argIRNNumber) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().GET_IRN_DETAILS.replaceAll("###", argIRNNumber));
		responseAPI(bufferURL.toString(),"GET");
	}
	
	/*
	 * 5 - To Generate e-WayBill by IRN
	 * */
	public void post_Gen_EWayBill_byIRN(String argJSONData, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().POST_GEN_EWAYBILL_BY_IRN);
		responseAPI(bufferURL.toString(),"POST");
	}
	
	/*
	 * 6 -To GSTInvoice Details from API 
	 * */
	public void get_GSTIN_Details(String argGSTInvNo, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL+ new GlobalNames().GET_GSTIN_DETAILS.replaceAll("###", argGSTInvNo));				
		responseAPI(bufferURL.toString(),"GET");
	}
	
	/*
	 * 7 - To Cancel EWayBill 
	 * */
	public void post_Cancel_EWayBill(String argJSONData, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL + new GlobalNames().POST_GEN_EWAYBILL_BY_IRN);
		responseAPI(bufferURL.toString(),"POST");
	}
	
	
	/*
	 * 8 - This helps to Get GSTInv Details from Common Portal
	 * */
	public void get_GSTIN_Details_by_CP(String argGSTIN_CP, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL+ new GlobalNames().GET_GSTIN_CP_DETAILS.replaceAll("###", argGSTIN_CP));				
		responseAPI(bufferURL.toString(),"GET");
	}
	
	/*
	 * 9 - This helps to get EWay Bill details by passing IRN.
	 * */
	public void get_IRN_Details(String argIRNNo, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL+ new GlobalNames().GET_EWAY_BILL_BY_IRN.replaceAll("###", argIRNNo));				
		responseAPI(bufferURL.toString(),"GET");
	}
	
	/*
	 * 10 - This helps to get IRN Detail by passing Document Details to Portal.
	 * */
	public void get_IRN_by_Docs(String argDocType, String argDocNo, String argDocDate, String argUName, String argAuthToken, String argGSTIn, String argSupGST) {
		bufferURL = new StringBuffer(new GlobalNames().SERVER_API_URL+ (new GlobalNames().GET_IRN_DOC_DETAILS.replaceAll("###", argDocType).replaceAll("$$$", argDocNo)).replaceAll("***", argDocDate) );				
		responseAPI(bufferURL.toString(),"GET");
	}
				
	
	public static void main(String[] args) {				
		
		//new ControllerAPI().get_GSTIN_Details_by_CP("33GSPTN1882G1Z3","","","","");
		
		new ControllerAPI().post_Authendicate("","","");
	}
	 
}
