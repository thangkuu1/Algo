package security;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;

/**
 * MAC (Message Authentication Code) algorithm is a symmetric (đối xứng) key cryptographic technique to provide message authentication.
 * For establishing MAC process, the sender and receiver share a symmetric key K.
 * Essentially(Bản chất) MAC is an encrypted checksum generatedon the underlying(nền tảng) message that is sent along with a message to ensure message authentication.
 * 
 * In Java the MAC class of the javax.crypto package provides the functionality of message authentication code. 
 * @author thangnd
 *
 */
public class CryptMAC {
	
	/*
	 * Step 1: Create a KeyGenerator object
	 * 		The KeyGenerator class provides genInstance() method which accepts  a String variable representing the required key-generating algorithm and return a KeyGenerator object that 
	 * 		generates secret keys. 
	 * Step 2: Create SecureRandom object
	 * 		The SecureRandom class of the java.Security package provides a strong random number generator which is used to generate random numbers in Java. 
	 * Step 3: Initialize the KeyGenerator
	 * 		The KeyGenerator class provides a method name init() this method accepts the SecureRandom object and initializes the current KeyGenerator
	 * 
	 * Step 4: Generate Key
	 * 		Generate key using generateKey() method of the KeyGenerator class
	 * Step 5: initialize the MAC object
	 * 		The init() method of the MAC class accepts an Key object and initializes the current MAC object using the given key.
	 * 
	 * Step 6: Finish the mac operation
	 * 		The doFinal() method of the MAC class is used to finish the MAC operation. Pass the required data in the form of byte array to this method and finish the operation as shown below
	 */
	
	public String MACSample(String mess) throws NoSuchAlgorithmException, InvalidKeyException {
		//create a KeyGenerator object AES, DES, DESede, hmacSHA1, hmacSHA256
		KeyGenerator keyGen = KeyGenerator.getInstance("hmacSHA256");
		//create SecureRandom 
		SecureRandom secRandom = new SecureRandom();
		
		//initialize KeyGenerator
		keyGen.init(secRandom);
		//Generate key
		Key key = keyGen.generateKey();
		
		//Create MAC object 
		Mac mac = Mac.getInstance("hmacSHA256");
		//initialize MAC object 
		mac.init(key);
		
		//Compute the MAC
		byte[] bytes = mess.getBytes();
		byte[] macResult = mac.doFinal(bytes);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < macResult.length; i++) {
			sb.append(Integer.toHexString(0xFF & macResult[i]));
		}
		return new String(sb);
		
	}
	
	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
		String mess = "How are you";
		String result = new CryptMAC().MACSample(mess);
		System.out.println(result);
	}

}
