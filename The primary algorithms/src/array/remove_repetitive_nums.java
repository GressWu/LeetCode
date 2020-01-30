package array;
/*给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

        不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

        示例 1:

        给定数组 nums = [1,1,2],

        函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

        你不需要考虑数组中超出新长度后面的元素。*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_repetitive_nums {
    public static void main(String[] args) {
        int a[] ={1,1,2,3,4,5,5,1,4};
        System.out.println(removeDuplicates(a));
    }

    /*public static int removeDuplicates(int[] nums) {
        int num;
        int t=0;
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        for (int i : nums) {
            hash.add(i);
        }
        num = hash.size();                                             //思路：利用LinkedHashSet()过滤掉重复数字
        for (int integer : hash) {
            nums[t]=integer;
            t++;
        }
        return num;
    }*/
    public static int removeDuplicates(int[] nums) {
       int t=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {                                                               //思路：利用HashMap方法 Contains（）减少一次循环
           if(!hash.containsKey(nums[i]))
           {
               hash.put(nums[i],i);
               nums[t]=nums[i];
               t++;
           }
       }
       return t;
    }
}
