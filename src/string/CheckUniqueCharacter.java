package string;

import java.util.HashSet;

/**
 * Check if String contains all unique characters
 * @author dinhd
 *
 */

public class CheckUniqueCharacter {
	
	
	/*
	 * 1. add each character to HashSet
	 * 2. If HashSet's add method returns false then it does not have all unique characters
	 */
	
	private boolean hasAllUniqueChars(String s){
		HashSet alphaSet = new HashSet<>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(!alphaSet.add(c)){
				return false;
			}
			
		}
		return true;
	}
	/*
	 * Using indexOf and lastIndexOf return same value for the character, then it is not repeated in that String
	 */
	private boolean hasAllUniqueCharacter(String s){
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(s.indexOf(c) != s.lastIndexOf(c)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		CheckUniqueCharacter checkUniqueChar = new CheckUniqueCharacter();
		String s = "thang";
		boolean checkUnique = checkUniqueChar.hasAllUniqueChars(s);
		boolean checkUnique_ = checkUniqueChar.hasAllUniqueCharacter(s);
		System.out.println(checkUnique);
		System.out.println(checkUnique_);
		
	}

}
