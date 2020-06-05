package binary_string;
/*
 * given 2 binary string of unequal lengths A and B, the task is to print the binary string which is the XOR of A and B
 */
public class XorTwoBinayString {
	
	public String addZeroToString(String str, int n){
		
		for(int i = 0; i < n; i++){
			str = "0" + str;
		}
		return str;
	}
	
	public String getXOR(String a, String b){
		
		if(a.length() < b.length()){
			a = addZeroToString(a, b.length() - a.length());
		}
		if(b.length() < a.length()){
			b = addZeroToString(b, a.length() - b.length());
		}
		String str = "";
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == b.charAt(i)){
				str += "0";
			}else{
				str += "1";
			}
		}
		
		
		return str;
	}
	public static void main(String[] args) {
		String a = "11001";
		String b = "111111";
		XorTwoBinayString xor = new XorTwoBinayString();
		
		String getXORStr = xor.getXOR(a, b);
		System.out.println(getXORStr);
	}

}
