package leetcode;

import java.util.Arrays;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * Input: s = "IceCreAm" -> I, e, e, A
 * Output: "AceCreIm"
 */
public class ReverseVowels {

    public String reverse(String s) {
        char [] charsS = s.toCharArray();
        int maxLength = charsS.length - 1;

        for(int i = 0; i < charsS.length; i ++) {

             if(checkVowels(charsS[i])) {
                 // find
                 if(i < maxLength) {
                     while (!checkVowels(charsS[maxLength])) {
                         maxLength -= 1;
                     }
                     char temp = charsS[i];
                     charsS[i] = charsS[maxLength];
                     charsS[maxLength] = temp;
                     maxLength -= 1;
                 }
             }
        }
        return new String(charsS);
    }

    public static boolean checkVowels(char s) {
        return 'a' == s || 'e' == s || 'i' == s || 'o' == s || 'u' == s
                || 'A' == s || 'E' == s || 'I' == s || 'O' == s || 'U' == s;
    }

    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
//        String s = "IceCreAm";
        String s = "a.";
        System.out.printf(reverseVowels.reverse(s));
    }
}
