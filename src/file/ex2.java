package file;

import java.io.FileWriter;
import java.io.IOException;

public class ex2 {
	
	public static void main(String[] args) throws IOException {
		String s = "20191103,0000230,GOGI HOUSE     ,25777000";
		s = s.toString();
		String s_ = "20191103,0000230,GOGI HOUSE     ,25777000";
		String s1 = removeSpecialText(s);
		String s1_ = removeSpecialText(s_);
		System.out.println("s value: " + s1);
		String[] str_s = s1.split(",");
		String[] str_s_ = s1_.split(",");
		String a = str_s[2].trim();
		System.out.println("value s : " +a);
		
		String s2 = str_s[0] + "," + str_s[1] + "," + str_s[2].trim() + "," + str_s[3];
		String s2_ = str_s_[0] + "," + str_s_[1] + "," + str_s_[2].trim() + "," + str_s_[3];
		System.out.println(s2);
		System.out.println(s2_);
	}
	
    public static String removeSpecialText(String s1){
        s1 = RemoveVietnameseSymbol(s1);
        String result = "";
        
        for(char r: s1.toCharArray()){
            if(!checkSpecialCharacter(r)){
            	result += r;
            }
            
        }
        return result;
    }
public static boolean checkSpecialCharacter(char r){
    
    int ascii_code = (int) r;
    if ((ascii_code >= 91 && ascii_code <= 96)
            || (ascii_code >= 123 && ascii_code <= 126)
            || (ascii_code >= 33 && ascii_code <= 43) 
            || (ascii_code >= 45 && ascii_code <= 47)
            || ascii_code >= 58 && ascii_code <= 64) {
        return true;
    } else {
        return false;
    }
}

public static String RemoveVietnameseSymbol(String a_text){
    String l_text = a_text;
    try {
        l_text = java.text.Normalizer.normalize(a_text, java.text.Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+","");
        l_text = l_text.replaceAll("Đ", "D");
        l_text = l_text.replaceAll("đ", "d");
    } catch (Exception ex) {
    }
    return l_text;
}
	

}
