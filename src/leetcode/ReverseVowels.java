package leetcode;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * Input: s = "IceCreAm" -> I, e, e, A
 * Output: "AceCreIm"
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        StringBuilder sb1 = new StringBuilder();
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (!checkVowels(s1.charAt(i))) {
                sb1.append(s1.charAt(i));
            } else {
                for (int j = s2.length() - 1; j > 0; j--) {
                    if (checkVowels(s2.charAt(j))) {
                        sb1.append(s2.charAt(j));
                        sb2.insert(0, s1.charAt(i));
                        s2 = s2.substring(0, j);
                        break;
                    } else {
                        sb2.insert(0, s2.charAt(j));
                    }

                }
                if (s2.length() == 1) sb2.insert(0, s2);
            }

        }
        return sb1.toString() + sb2.toString();
    }

    public static boolean checkVowels(char s) {
        return 'a' == s || 'e' == s || 'i' == s || 'o' == s || 'u' == s
                || 'A' == s || 'E' == s || 'I' == s || 'O' == s || 'U' == s;
    }

    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
        String s = "aaaiue";
        System.out.printf(reverseVowels.reverseVowels(s));
    }
}
