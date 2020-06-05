package data_big;

public class RemoveCharacter {
	public static String removeSpecialText(String s){
        //s = RemoveVietnameseSymbol(s);
        String result = "";
        
        for(char r: s.toCharArray()){
            if(checkSpecialCharacter(r)){
                 result += r;
            }
        }
        return result;
    }
    public static boolean checkSpecialCharacter(char r){
        
        int ascii_code = (int) r;
            if ((ascii_code >= 48 && ascii_code <= 57)
                    || (ascii_code >= 65 && ascii_code <= 90)
                    || (ascii_code >= 97 && ascii_code <= 122) 
                    || ascii_code == 39 || ascii_code == 45 || ascii_code == 32) {
                return true;
            } else {
                return false;
            }
    }

}
