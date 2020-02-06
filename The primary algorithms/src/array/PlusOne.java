package array;

import java.util.Arrays;

/*      Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

        You may assume the integer does not contain any leading zero, except the number 0 itself.

        Example 1:

        Input: [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Example 2:

        Input: [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.*/
public class PlusOne {
    public static void main(String[] args) {
        Solution6 so = new Solution6();
        int[] a = {9,9};
        int[] ints = so.plusOne(a);
        System.out.println(Arrays.toString(ints));
    }
}

class Solution6 {
    public int[] plusOne(int[] digits) {
      /*  String s = "";
        for (int digit : digits) {
            s += digit;
        }
        int result = Integer.parseInt(s) + 1;
        s = result + "";
        int[] b = new int[s.length()];                    //这种方法如果数组过长 就会产生转换错误
        for (int i = 0; i < s.length(); i++) {
            b[i] = s.charAt(i) - '0';
        }
        return b;*/
     /* for (int i=digits.length-1;i>=0;i--)
      {
          if(digits[i]==9)
            digits[i]=0;
          else {
              digits[i]++;
              return digits;
          }
      }
      if(digits[0]==0)
      {
          int[] newArry=new int[digits.length+1];
          newArry[0]=1;
          for(int i=1;i<digits.length+1;i++)
              newArry[i]=digits[i-1];
          return newArry;
      }
      return digits;
    */
        for (int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]==9)
                digits[i]=0;
            else {
                digits[i]++;
                return digits;                                          //对第二种方法的一种改进
                                                                        //思路是如果这里的末位不是9，那么直接返回
            }
        }
        int[] result = new int[digits.length+1];
        result[0]=1;                                                    //如果一直循环结束代表该数原始数据为999...99直接创建新数组返回即可
        return result;
    }
}