package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * how to find all permutations of String in Java permutation: hoán vị
 * 
 * take out first character of String and insert into different places of permutation of remaining String recursively
 * @author dinhd
 *
 */
public class FindAllPermutation {
	/*
	 * Lets say you have String as ABc
	 * So we take out A from ABC
	 * First character = A RemainingString=BC
	 * As we are applying recursion here, we will find permutation of BC
	 * Take out B from BC
	 * First character=B remainingString=C
	 * As we are applying recursion here, we will find permutation of C
	 * when we take out C, our String size becomes 0 and that is our base case here.
	 * first character=C remainingString = ""
	 * We insert C to differences indexes of Permutations of RemainingString(""), so we get permutation of C as C
	 * We insert B to differences indexes of Permutations of RemainingString(C), so we get BC and CB.
	 * C: BC, CB
	 * Now we insert A to different indexes in BC and CB
	 * BC: ABC, BAC, BCA
	 * CB: ACB, CAB, CBA
	 * 
	 */
	public static Set<String> permutationOfString(String str){
		Set<String> permutationSet = new HashSet();
		if(str.length() == 0){
			permutationSet.add("");
			return permutationSet;
		}
		// take out first character of String 
		char firstChar = str.charAt(0);
		// remaining String 
		String remainingString = str.substring(1);
		
		//recursion permutation 
		Set<String> permutedSetRemainingString = permutationOfString(remainingString);
		
		for(String permuted: permutedSetRemainingString){
			for(int i = 0; i <= permuted.length(); i++){
				String permutation = insertFirstCharacterAtDiffPlaces(permuted, firstChar, i);
				permutationSet.add(permutation);
			}
		}
		return permutationSet;
	}
	
	public static String insertFirstCharacterAtDiffPlaces(String perm, char firstChar,int index){
		//Inserting firstCharacter of orig String at difference places based on index
		
		return perm.substring(0, index) + firstChar + perm.substring(index);
	}
	
	public static void main(String[] args) {
		String str = "than";
		Set<String> permutationSet = permutationOfString(str);
		for(Iterator<String> iterator = permutationSet.iterator(); iterator.hasNext();){
			String iterString = iterator.next();
			System.out.println(iterString);
		}
	}
	

}
