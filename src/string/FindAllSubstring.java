package string;

/**
 * If input 'abb' then output should be 'a', 'b', 'b', 'ab', 'bb', 'abb'
 * @author dinhd
 *
 */

public class FindAllSubstring {
	
	public static void findAllSubstring(String s ){
		for(int i = 0; i < s.length(); i++){
			for(int j = i + 1; j < s.length(); j++){
				System.out.print("'" + s.substring(i, j) + "',");
			}
		}
	}

	public static void main(String[] args) {
		String s = "abbaabcd";
		FindAllSubstring.findAllSubstring(s);
	}
}
