package com.rest.api.commonutils;


import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;



public class AES {
	
	public static final String publicKey = new String("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt0ZX9z6SkBoSTgscNe9Z"
			+ "X/WUK59YbszpZkVnpc0zodtQyVdeS3/KPvdVhuLkY9oKOWzc6hQGJ83ZGj9RhPuW"
			+ "3lexkIdR/D+7jT1ILCVWksH85k7REJmFzrTEIjqUyfgttmSXm1Cqt4MIswVaulIL"
			+ "FY3nj4bi6qcItLfCH1XkK3i9WZe9/gYNH9N1byc427Xy7JWLxWlj0OuIvK1Roj9B"
			+ "JzbMF5En8FD/KWdrVS5O0yKungic44o/AVsDnEAzvH0FrjS2jD0UxvgBKEXFLFkc"
			+ "xQNqkWL3lBTZrmyZKNLQRtHJiETonxYSMaTKQArxiHWgls47Z7gHNfosxoKB/r3/"
			+ "JQIDAQAB");

	// Generation of appKey
	 public static byte[] createAESKey() {
		 byte[] appKey = null;
	      try {
	          KeyGenerator gen = KeyGenerator.getInstance("AES");
	          gen.init(256);
	          SecretKey secret = gen.generateKey();
	          appKey = secret.getEncoded();
	          } catch (NoSuchAlgorithmException ex) {
	          //Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
	        	  System.out.println(ex.toString());
	        }
	    return appKey;
	 }      
	 
	 /* Asymmetric Encryption (RSA) process starts */
	 public static String encryptAsymmetricKey(String pubkey, String password) throws Exception{

		    PublicKey publicKeys = convertPubStringToKey(pubkey);
		    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
		    cipher.init(Cipher.ENCRYPT_MODE, publicKeys);
		   byte[] encryptedText = cipher.doFinal(password.getBytes());
		   String encryptedPassword = Base64.encodeBase64String(encryptedText);
		   return encryptedPassword;
	 }

	 private static PublicKey convertPubStringToKey(String publikkey){
		 PublicKey pubKey = null;
		 byte[] publicBytes = Base64.decodeBase64(publikkey);
		 X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicBytes);
		 KeyFactory keyFactory;
		 try {
			 keyFactory = KeyFactory.getInstance("RSA");
			 pubKey = keyFactory.generatePublic(keySpec);
		 } catch (Exception e) { e.printStackTrace(); }
		 return pubKey;
	 }
	 
	 public static String encryptAsymmetricKey(String pubkey, byte[] appKey) throws Exception {
		 PublicKey publicKeys = convertPubStringToKey(pubkey);
		 Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
		 cipher.init(Cipher.ENCRYPT_MODE, publicKeys);
		 byte[] encryptedText = cipher.doFinal(appKey);
		 String encryptedAppKey = Base64.encodeBase64String(encryptedText);
		 return encryptedAppKey;
	 }
	 
	 /* Asymmetric Encryption (RSA) process ends */
	 
	 /* Symmetric Key Decryption process starts */
	 
	 public static String decrptBySyymetricKey(String encryptedSek, byte[] appKey) {
		 Key aesKey = new SecretKeySpec(appKey, "AES"); // converts bytes(32 byte random generated) to key
		 try {
			 Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); // encryption type = AES with padding PKCS5
			 cipher.init(Cipher.DECRYPT_MODE, aesKey); // initiate decryption type with the key
			 byte[] encryptedSekBytes = Base64.decodeBase64(encryptedSek); // decode the base64 encryptedSek to bytes
			 byte[] decryptedSekBytes = cipher.doFinal(encryptedSekBytes); // decrypt the encryptedSek with the initialized cipher containing the key(Results in bytes)
			 String decryptedSek = Base64.encodeBase64String(decryptedSekBytes); // convert the decryptedSek(bytes) to Base64 StriNG
			 return decryptedSek; // return results in base64 string
		 } catch(Exception e) { return "Exception; "+e; }
	 }
	 
	 /* Symmetric Key Decryption process ends */
	 
	 /* Symmetric Key Encryption process starts */
	 
	 @SuppressWarnings("unused")
	private static String encryptBySymmetricKey(String json, String decryptedSek) {
		 byte[] sekByte = Base64.decodeBase64(decryptedSek);
		 Key aesKey = new SecretKeySpec(sekByte, "AES");
		 try {
			 Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			 cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			 byte[] encryptedjsonbytes = cipher.doFinal(json.getBytes());
			 String encryptedJson = Base64.encodeBase64String(encryptedjsonbytes);
			 return encryptedJson;
		 } catch(Exception e) { return "Exception "+e; }
	}
	 
	 /* Symmetric Key Encryption process ends */
	 
	 /* Symmetric Key Decryption (Decrypt using SEK) process starts */
	 
		
	 /*
	  public static String decryptBySymmentricKey(String data, String decryptedSek) {
	     byte[] sekByte = Base64.getDecoder().decode(decryptedSek);
	     Key aesKey = new SecretKeySpec(sekByte, "AES");
	      try {
	           Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	           cipher.init(Cipher.DECRYPT_MODE, aesKey);
	           byte[] decordedValue = new BASE64Decoder().decodeBuffer(data);
	           byte[] decValue = cipher.doFinal(decordedValue);
	           return new String(decValue);
	       } catch (Exception e) {
	           return "Exception " + e;
	        }
	    }
		 
	  */
	 public static String decrptyBySyymetricKey(String encryptedSek, byte[] appKey) {
		 Key aesKey = new SecretKeySpec(appKey, "AES"); // converts bytes(32 byte random generated) to key
		 try {
			 Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); // encryption type = AES with padding PKCS5
			 cipher.init(Cipher.DECRYPT_MODE, aesKey); // initiate decryption type with the key
			 byte[] encryptedSekBytes = Base64.decodeBase64(encryptedSek); // decode the base64 encryptedSek to bytes
			 byte[] decryptedSekBytes = cipher.doFinal(encryptedSekBytes); // decrypt the encryptedSek with the initialized cipher containing the key(Results in bytes)
			 String decryptedSek = Base64.encodeBase64String(decryptedSekBytes); // convert the decryptedSek(bytes) to Base64 StriNG
			 return decryptedSek; // return results in base64 string
		 }catch(Exception e) { return "Exception; "+e; }
	 }
	  
	  /* Symmetric Key Decryption (Decrypt using SEK) process ends */
	 
	  /*Symmetric Key Decryption using Java */

	 public static void main (String[] args) {
		 
		 System.out.println(new AES().createAESKey());
	 }
	  
	 
}
