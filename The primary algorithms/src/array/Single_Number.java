package array;

/*
        Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4
*/
import java.util.Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] a={1,1,5,3,3};
        Solution4 so=new Solution4();
        int singleNumber = so.singleNumber(a);
        System.out.println(singleNumber);

    }
}
class Solution4 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i + 1] != nums[i])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
