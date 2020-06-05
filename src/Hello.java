import java.util.Calendar;

public class Hello {
    public static String removeSpecialText(String s){
        s = RemoveVietnameseSymbol(s);
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
                || (ascii_code >= 68 && ascii_code <= 90)
                || (ascii_code >= 97 && ascii_code <= 122) 
                || ascii_code == 32
                || ascii_code == 44) {
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


	public static void main(String[] args) {
		// 
        Hello h = new Hello();
        String s = h.removeSpecialText("201912231249096107152000294304002512107      808400000000310200002268B");
        System.out.println(s);
        System.out.println(s.length());

	}

}
