package array.maxcontainerwater;

public class MaxContainerWater {
    /**
     * Given an array of n non-negative integers height[n], where each value
     * represent a point at coordinate(i, height[i]). Now n vertical lines are
     * drawn such that the two endpoint of line i are at (i,0) and (i, height[i])
     * Here each pair of a line with the x-axis forms a container
     * -> write a program to find two lines, such that the container contains the
     * most water.
     *
     * example: input: height[] = [1,5,6,3,4,2], output: 12
     * Explanation: the area between line 5 and 4 will be maximum, 5 and 4 are
     * distance 3 apart.
     *
     */

    public static int maxContainerWater(int[] height, int n){
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int currArea = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }

    public static int maxContainerWaterUpgrade(int[] height, int n){

        int maxArea = 0;
        int i = 0;
        int j = n - 1;
        while (i < j){
            int currArea = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(currArea, maxArea);
            if(height[i] < height[j]){
                i = i + 1;
            } else {
                j = j - 1;
            }

        }
        return  maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,5,6,3,4,2};
        System.out.println(maxContainerWater(height, height.length));
        System.out.println(maxContainerWaterUpgrade(height, height.length));
    }



}
