package leetcode;

import java.util.Arrays;

/**
 *Given an integer array nums,
 * return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arrFinal = new int[nums.length];
        // find value 1
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == 1) count1++;
            if (num == -1) count2++;
        }
        if(count1 == nums.length) {
            return nums;
        }
        if((count1 + count2) == nums.length) {
            if(count2 % 2 == 0) {
                return  nums;
            } else {
                for(int i =0; i < nums.length; i++) {
                    arrFinal[i] = nums[i] * -1;
                }
                return arrFinal;
            }

        }
        for(int i = 0; i < nums.length; i ++ ) {
            int j = 0;
            int multiS = 1;

            while(j < nums.length) {
                if(j != i) {
                    if(nums[j] == 0) {
                        multiS = 0;
                    }
                    if(multiS == 0) {
                        break;
                    }else {
                        if(multiS == 1) {
                            multiS = nums[j];
                        } else {
                            multiS *= nums[j];
                        }

                    }

                }
                j++;
            }
            arrFinal[i] = multiS;
        }
        return arrFinal;
    }



    public static void main(String[] args) {
//        int [] s = {1,2,3,4};
        int [] s = {1,1,1,1,1};
        ProductArrayExceptSelf s1 = new ProductArrayExceptSelf();
        System.out.printf("s: " + Arrays.toString(s1.productExceptSelf(s)));
    }
}
