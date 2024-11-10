package Questions;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
import java.util.*;

public class SpecialArrayXelementsGreaterThanX {
    public static void main(String[] args) {
        int [] arr = {3,5};
        int res = specialArray(arr);
        System.out.println(res);
    }
    static int specialArray(int[] nums)
    {
                int countNo[] = new int[nums.length + 1];

                for (int val : nums) {
                    countNo[Math.min(val, nums.length)]++; // This will count all numbers in array
                }

                int totalRight = 0;

                for (int i = nums.length; i >=0 ; i--) {
                    totalRight += countNo[i];

                    if (i == totalRight) {
                        return totalRight;
                    }
                }
                return -1;
            }
        }
