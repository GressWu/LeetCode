package array;

import java.util.Arrays;

/*      Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].*/
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        Solution7 sol = new Solution7();
        int[] ints = sol.twoSum(a, 9);
        System.out.println(Arrays.toString(ints));
    }
}

class Solution7 {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] ch = new int[2];
        for (i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ch[0] = i;
                    ch[1] = j;
                    flag = false;
                }
            }
            if (!flag)
                break;
        }
        return ch;
    }
}
