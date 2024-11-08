package Questions;
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayformInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 6, 7};
        int k = 34;
        System.out.println(addToArrayForm(num, k)); // Output: [1, 2, 3, 4]
    }
    static List<Integer> addToArrayForm(int[] num,int k)
    {
        List<Integer> res = new ArrayList<>();
        int i =num.length-1;

        while(i>=0||k>0)
        {
            if(i>=0)
            {
                k+=num[i];
            }
            res.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(res);
        return res;
    }
}

