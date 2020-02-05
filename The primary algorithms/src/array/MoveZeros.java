package array;

import java.util.Arrays;

/*      Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Example:

        Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Note:

        You must do this in-place without making a copy of the array.
        Minimize the total number of operations.*/
public class MoveZeros {
    public static void main(String[] args) {
        Solution5 so=new Solution5();
        int[] a={0,0,1};
        System.out.println(Arrays.toString(a));
        so.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}

class Solution5 {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] == 0) {
                    int t;
                    t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
    }
}
