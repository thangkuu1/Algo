package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in a tag-based language like xml or HTML. contents are enclosed between a start tag and an end tag like
 * <tag>contents</tag> Note that the corresponding end tag starts with a 
 * Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within
 * sequences of well-orangzed tags metting the following criterion
 * @author thangnd3
 *
 */

public class TagConentExtractor {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextLine());
		int testCase = Integer.parseInt(scan.nextLine());
		System.out.println(testCase);
		while(testCase -- > 0){
			String line = scan.nextLine();
			
			boolean matchFound = false;
			String regex = "<(.+>([^<+)</\\1>";
			Pattern r = Pattern.compile(regex);
			Matcher m = r.matcher(line);
			while(m.find()){
				System.out.println(m.group(1));
				System.out.println(m.group(2));
				matchFound = true;
			}
			if(matchFound == false){
				System.out.println("none");
			}
		}
	}
}
