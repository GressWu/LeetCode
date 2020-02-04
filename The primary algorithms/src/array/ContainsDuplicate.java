package array;
/*      Given an array of integers, find if the array contains any duplicates.

        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

        Example 1:

        Input: [1,2,3,1]
        Output: true
        Example 2:

        Input: [1,2,3,4]
        Output: false
        Example 3:

        Input: [1,1,1,3,3,4,3,2,4,2]
        Output: true*/
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] a={1,2,3,4};
        boolean result=solution3.containsDuplicate(a);
        System.out.println(result);
    }
}
class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i])
                return true;
        }
        return false;
    }
}