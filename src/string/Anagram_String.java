package string;

import java.util.Arrays;

/**
 * Two string are anangram if they have some characters but in defferent order . 
 * Anagram mean if two string have same characters but in a different order
 * @author dinhd
 *
 */

public class Anagram_String {

	
	/*
	 * function using string method
	 * 1.pass two string word and anagram to method call isAnagramUsingStringMethod()
	 * 2. Iterate over first String word and get character c from it using chartAt() method
	 * 3. If index of char c is -1 in second string anagram, then two strings are not anagrams
	 * 4, If index of char c is not -1 in second string angram, then remove the character from the String anagram
	 * 5. If you get empty String in the end, then two String are anagram of each other
	 */
	
	public boolean isAngaramUsingStringMethod(String word, String anagram){
		if(word.length() != anagram.length()){
			return false;
		}
		
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			if(index != -1){
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			}else{
				return false;
			}
			
		}
		return anagram.isEmpty();
		
	}
	
	/**
	 * function using arrays.sort()
	 * @param args
	 */
	private boolean isAnagramUsingArraySort(String word, String anagram){
		String sortWord = sortWord(word);
		String sortAnagram = sortWord(anagram);
		return sortAnagram.equals(sortWord);
	}
	
	public String sortWord(String word){
		char[] wordArr = word.toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram_String a_s = new Anagram_String();
		String word = "thang";
		String anagram = "nga2h";
		boolean isAnagram = a_s.isAngaramUsingStringMethod(word, anagram);
		boolean isAnangramUsingArraySort = a_s.isAnagramUsingArraySort(word, anagram);
		System.out.println(isAnangramUsingArraySort);
		System.out.println(isAnagram);
	}

}
