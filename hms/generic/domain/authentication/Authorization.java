package com.hms.generic.domain.authentication;


import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public class Authorization {
	
	private static final String encryptionKey = "healthmanage2019";
    private static final String characterEncoding = "UTF-8";
    private static final String cipherTransformation = "AES/CBC/PKCS5PADDING";
    private static final String aesEncryptionAlgorithem = "AES";

    public static String encryptPassword(String plainText) {
    	
        String encryptedPwd = "";
        try {
            Cipher cipher = Cipher.getInstance(cipherTransformation);
            byte[] key = encryptionKey.getBytes(characterEncoding);
            SecretKeySpec secretKey = new SecretKeySpec(key, aesEncryptionAlgorithem);
            IvParameterSpec ivParams = new IvParameterSpec(key);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParams);
            byte[] cipherTxt = cipher.doFinal(plainText.getBytes("UTF8"));
            Base64.Encoder encoder = Base64.getEncoder();
            encryptedPwd = encoder.encodeToString(cipherTxt);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return encryptedPwd;
    }
    
    public static String decryptPassword(String encryptedPwd) {
        String decryptedPwd = "";
        try {
            Cipher cipher = Cipher.getInstance(cipherTransformation);
            byte[] key = encryptionKey.getBytes(characterEncoding);
            SecretKeySpec secretKey = new SecretKeySpec(key, aesEncryptionAlgorithem);
            IvParameterSpec ivParams = new IvParameterSpec(key);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParams);
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] cipherTxt = decoder.decode(encryptedPwd.getBytes("UTF8"));
            decryptedPwd = new String(cipher.doFinal(cipherTxt), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedPwd;
    }
    
    public static void main(String[] args) {
    	System.out.println(encryptPassword("Aug@2020"));
    }
}

