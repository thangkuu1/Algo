package leetcode;

/**
 * For two strings s and t,
 * we say "t divides s" if and only if s = t + t + t + ... + t + t
 * (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2,
 * return the largest string x such that x divides both str1 and str2.
 * str1 = "ABCABC" str2 = "ABC"
 * str1 = "ABABABAB", str2 = "AB"
 */
public class GreatestString {


    public String gcd (String str1, String str2) {
        // if str1 < str2 recur str2, str1
        if(str1.length() < str2.length()) {
            return gcd(str2, str1);

        }
        // if str1 not concat str2 -> return ""
        else if (!str1.startsWith(str2)) {
            return "";
        }
        // if str2 is empty return str1
        else if (str2.isEmpty()) {
            return str1;
        }
        //
        else {
            return gcd(str1.substring(str2.length()), str2);
        }

    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        GreatestString gs = new GreatestString();
        System.out.println(gs.gcd(str1, str2));

    }
}
