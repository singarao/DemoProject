package com.facebook.login;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncryptionDemo {


	public static void main(String[] args) {
		
		String passwordText = "Test143$";
		
		byte[] encodedBase64 = Base64.encodeBase64(passwordText.getBytes());
		
		String encodedcPasswordText = new String(encodedBase64);
		
		System.out.println("Encrypted Password is - "+encodedcPasswordText);

	}

}
