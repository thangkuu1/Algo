package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author dinhd
 * How will find firt non repeated character in String
 * Ex: input: analogy => output: return "n"
 * 	   input: easiest => output: return "a" 
 */
public class FirstNonRepeatChar {
	
	/*
	 * 1. Get character while looping over String
	 * 2. put this character in LinkedHashMap with count. If character is already there, increase count by 1;
	 * 3. Get count from LinkedHashMap while iterating. If count = 1 return that character as LinkedHashMap 
	 * 	maintains insertion order.
	 */
	
	private static Character GetFirstNonRepeatingCharacter(String s){
		Map<Character, Integer> countCharacter = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++){
			Character c = s.charAt(i);
			if(!countCharacter.containsKey(c)){
				countCharacter.put(c, 1);
			}else{
				countCharacter.put(c, countCharacter.get(c) + 1);
			}
		}
		for(Entry<Character, Integer> entry: countCharacter.entrySet()){
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return null;
	}
	
	/*
	 * Iterate through each character if string 
	 * If lastIndexOf and indexOf return same value, then if first non repeating in the String
	 */
	
	private static Character getNonRepeatCharacter(String s){
		char[] arr_s = s.toCharArray();
		for(int i = 0; i < arr_s.length; i++){
			if(s.lastIndexOf(arr_s[i]) == s.indexOf(arr_s[i])){
				return arr_s[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String s = "ananlogy";
		Character ch = FirstNonRepeatChar.GetFirstNonRepeatingCharacter(s);
		System.out.println("result: " + ch.toString() );
		Character c = FirstNonRepeatChar.GetFirstNonRepeatingCharacter(s);
		System.out.println("result_: " + c.toString());
	}

}
