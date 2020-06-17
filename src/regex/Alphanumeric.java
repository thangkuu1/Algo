package regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We can use the given regular expression used to validate user input in such a way that it allows
 * only alphanumeric character. Alphanumeric are all alphabets and numbers. letters A-Z, a-z, and digits 0-9.
 * 
 * With alphanumeric regex at our disposal, the solution is dead simple. A character class can set up the allowed
 * range of characters. with an add quantifier that repeats the character class on or more times. and anchors
 * that bind the match to the start and end of the string, we're good to go
 * @author thangnd3
 *
 */
public class Alphanumeric {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("tha^ng");
		names.add("#dinh");
		names.add("nguyen#");
		String regex = "[a-zA-Z0-9]";
		
		Pattern pattern = Pattern.compile(regex);
		for(String name: names){
			Matcher mathcher = pattern.matcher(name);
			System.out.println(mathcher.matches());
		}
	}

}
