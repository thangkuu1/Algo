package string;
/*
 * reverse a string in java
 */

public class Reverse_String {
	
	/*
	 * function reverse string using for loop 
	 * 1.1. Declare empty string reserve_s. The will contain our final reverse string 
	 * 1.2. Iterate over array using for loop from last index to 0th index
	 * 1.3. Add character to String reverse while iterating
	 */
	private String reverse_loop(String s){
		String reverse_s = "";
		for(int i = s.length() - 1; i >= 0; i--){
			reverse_s += s.charAt(i);
		}
		return reverse_s;
	}
	
	/*
	 * function reverse string using recursion
	 * we will process last character of string and call recursive function for rest of the string. base case of the recursion 
	 * will be once the length of string is 1.
	 */
	
	private String reverse_recursion(String s){
		if(s.length() == 1){
			return s;
		}else{
			return s.charAt(s.length() -1 ) + reverse_recursion(s.substring(0, s.length() -1));
		}
	}
	
	/*
	 * function reverse string using stringbuffer
	 */
	private String reverse_stringbuffer(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String s = "thangnguyen";
		Reverse_String reverse = new Reverse_String();
		String r_s = reverse.reverse_loop(s);
		String recursion = reverse.reverse_recursion(s);
		String sb_reverse = reverse.reverse_stringbuffer(s);
		System.out.println(r_s);
		System.out.println(recursion);
		System.out.println(sb_reverse);
	}

}
