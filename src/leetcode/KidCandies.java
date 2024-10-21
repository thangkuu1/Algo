package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has,
 and an integer extraCandies, denoting the number of extra candies that you have.
 */

public class KidCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // max candies
        int maxCandies = candies[0];
        for(int i=1;i<candies.length;i++) {
            if(candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        // check i < max candies -> return false else return true
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {

            if((candies[i] += extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
