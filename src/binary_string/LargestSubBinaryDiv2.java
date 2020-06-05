package binary_string;

/*
 * Given a binary string str of length N,the task is to find the longest sub-string divisible by 2.
 * If no such sub-string exits then print -1
 */

public class LargestSubBinaryDiv2 {
	
	public String getLargestSub(String a){
		
		String str = "";
		int point = -1;
		for(int i = a.length() - 1; i >= 0; i--){
			if(a.charAt(i) == '0'){
				point  = i;
				break;
			}
		}
		if(point == -1){
			str = "-1";
		}else{
			str = a.substring(0, point  + 1);
		}
		
		return str;
	}
	public static void main(String[] args) {
		String a = "111";
		LargestSubBinaryDiv2 lsbd = new LargestSubBinaryDiv2();
		System.out.println(lsbd.getLargestSub(a));
	}

}
