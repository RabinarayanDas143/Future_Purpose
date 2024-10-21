package com.example.WebDevelopment;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESEncryption {

    // Method to encrypt a string using AES algorithm
    public static String encrypt(String data, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES"); // Create Cipher for AES encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey); // Initialize Cipher in encrypt mode
        byte[] encryptedData = cipher.doFinal(data.getBytes()); // Encrypt the data

        // Return encrypted data as Base64 encoded string (to make it readable)
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    // Method to decrypt a string using AES algorithm
    public static String decrypt(String encryptedData, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES"); // Create Cipher for AES decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey); // Initialize Cipher in decrypt mode
        byte[] decodedData = Base64.getDecoder().decode(encryptedData); // Decode Base64 encoded data
        byte[] originalData = cipher.doFinal(decodedData); // Decrypt the data

        return new String(originalData); // Return the original data
    }

    // Helper method to generate AES secret key
    public static SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // AES uses 128-bit, 192-bit, or 256-bit key
        return keyGen.generateKey(); // Generate the secret key
    }

    public static void main(String[] args) throws Exception {
        String originalString = "Hello, World!";

        // Generate a new secret key for encryption
        SecretKey secretKey = generateSecretKey();

        // Encrypt the string
        String encryptedString = encrypt(originalString, secretKey);
        System.out.println("Encrypted String: " + encryptedString);

        // Decrypt the string
        String decryptedString = decrypt(encryptedString, secretKey);
        System.out.println("Decrypted String: " + decryptedString);
    }
}

