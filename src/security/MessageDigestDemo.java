package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hash function are extremely useful and appear in almost all information security applications.
 * A hash function is a mathematical function that converts a numerical input value into another compressed numerical value. The input to the hash function is of arbitrary length but output is always of fixed length
 * 
 * Values returned by a hash function are called message digest or simply hash value. following MESSAGE => (Hash function) => MESSAGE DIGEST
 * 
 * Java provides a class name MessageDigest which belongs to the package java.security. This class supports algorithms such as SHA-1, SHA 256, MD5 algorithms to convert an arbitrary (bất kỳ)  length message 
 * to a message digest.
 * @author thangnd
 *
 */
public class MessageDigestDemo {
	
	/*
	 * Step 1: Create a MessageDigest Object 
	 * 		The messagedigest class provides a method named getInstance(). This method accepts a String variable specifying the name of the algorithm to be used and returns a MessageDigest object implementing 
	 * 		the specified algorithm
	 * Step 2: Pass data to the created MessageDigest object
	 * 		After creating the message digest object, you need to pass the message/data to it. You can do so using the update() method  of the MessageDigest class, this method accepts a byte array representing 
	 * 		the message and adds/passes it to the above created MessageDigest object.
	 * Step 3: Generate the message digest
	 * 		You can generate the message digest using the digest() method. The MessageDigest class this method computes the hash function on the current object and returns the message digest in the form of byte array
	 */
	
	public String MessDigest(String str) throws NoSuchAlgorithmException {
		//Create the message digest
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		//Passing data to the create MessageDigest Object
		md.update(str.getBytes());
		
		//Compute the message digest
		byte[] digest = md.digest();
		System.out.println(digest);
		
		//convert the byte array in to HexString format
		StringBuffer hexString = new StringBuffer();
		
		for(int i = 0; i < digest.length; i ++) {
			hexString.append(Integer.toHexString(0xFF & digest[i]));
		}
		
		System.out.println(hexString);
		
		return hexString.toString();
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String str = "hello my name is Thang";
		String result = new MessageDigestDemo().MessDigest(str);
		System.out.println(result);
	}
	
}
