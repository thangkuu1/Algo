package security;

import java.security.MessageDigest;

/**
 * The MD5 (message-digest algorithms) is a widely used cryptographic hash function that produces a 128-bit(16-byte) hash value. It's very simple and 
 * straight forward (thẳng tiến).
 * the basic idea is to map data sets of variable length to data sets of a fixed length
 * 
 * in order to do this, the input message is split into chunks of 512-bit blocks. A padding is added to the end so that it's length can be divided by 512.
 * Now, these blocks are processed by the MD5 algorithm.  which operates in a 128-bit state , and the result will be a 128-bit hash value.
 * After applying MD5, generated hash is typically a 32-digit hexadecimal number.
 * 
 * 
 * 
 * @author thangnd
 *
 */

public class MD5Algorithm {
	
	public String passwordWithMD5(String passwordToHash) {
		String generatedPassword = null;
		try {
			//create messgagedigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//add password bytes to degist
			md.update(passwordToHash.getBytes());
			//get the hash's bytes
			byte[] bytes = md.digest();
			System.out.println(bytes.toString());
			//this byte[] has bytes in decimal format
			//convert it to hexdecimal format
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < bytes.length; i++) {
				sb.append(String.format("%02x", bytes[i] & 0xff));
			}
//			System.out.println(Integer.parseInt(bytes.toString(), 16));
			
			generatedPassword = sb.toString();
			return generatedPassword;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			return null;
		}
	}
	
	public static void main(String[] args) {
		MD5Algorithm md5 = new MD5Algorithm();
		String pass = md5.passwordWithMD5("D7F5Bb1!");
		System.out.println(pass);
	}

}
