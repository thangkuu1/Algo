package string;
/**
 * How to check if one String is rotation of another String in Java
 * @author dinhd
 *
 */

public class CheckRotationString {
	
	/**
	 * 1.Create a new String str3 = str1+str1;
	 * 2. Check if str3 contains str2 or not
	 * 3. If str3 contains str2 is ratation of str1 else it is not
	 * @param args
	 */
	
	private boolean checkRotationString(String str1, String str2){
		String str3 = str1 + str1;
		if(str3.contains(str2)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckRotationString checkRotation = new CheckRotationString();
		String str1 = "thangnd";
		String str2 = "ndthang";
		boolean isCheck = checkRotation.checkRotationString(str1, str2);
		System.out.println(isCheck);
	}

}
