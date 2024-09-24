package Functions;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int [] nums)
    {
        nums[0]=50;
    }
}