package string;

//import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.HashMap;

public class FindDuplicateString {
	
	/*
	 * 1. Create HashMap and character of String will be inserted as key and its count as value
	 * 2. If HashMap already contains char, increase its count by 1, else put char in HashMap
	 * 3. if value of char is more than 1, that means it is duplicate character in that String
	 */
	private HashMap<Character, Integer> findDuplicateString(String s){
		
		HashMap<Character, Integer> charCountMap = new HashMap();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			
			if(charCountMap.containsKey(c)){
				charCountMap.put(c, (int)(charCountMap.get(c)) + 1);
			}else{
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicateString findDuplicate = new FindDuplicateString();
		String s = "nguyendinhthang";
		HashMap<Character, Integer> mapString = findDuplicate.findDuplicateString(s);
		for(Character c : mapString.keySet()){
			if(mapString.get(c) > 1){
				System.out.println("duplicate character " + c + " count: " + mapString.get(c));
			}
		}
	}

}
