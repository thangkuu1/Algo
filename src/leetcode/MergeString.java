package leetcode;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 */
public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if(i < min) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            } else {
               if( word1.length() - word2.length()  > 0 ){
                   result.append(word1.charAt(i));
               } else {
                   result.append(word2.charAt(i));
               }

            }

        }


        return result.toString();

    }

    public static void main(String[] args) {
        MergeString mergeString = new MergeString();
        System.out.println("merge: " + mergeString.mergeAlternately( "abc", "pqr"));
        System.out.println("merge1: " + mergeString.mergeAlternately( "ab", "pqrs"));
    }

}
