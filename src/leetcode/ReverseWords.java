package leetcode;

/**
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class ReverseWords {
    public String reverseWords(String s) {

        // convert string to array
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            if (!" ".equals(list[i]) && !list[i].isEmpty()) {
                sb.append(list[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "       ";
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords(s));
    }
}
