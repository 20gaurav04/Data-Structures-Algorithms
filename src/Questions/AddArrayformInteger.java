package Questions;
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;

public class AddArrayformInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 45;
        System.out.print(addToArrayForm(arr,k));
    }
    static List<Integer> addToArrayForm(int[] arr,int k)
    {
        List<Integer> NewList = new ArrayList<>();
        int newNum=0;

        
        for(int i:arr)
        {
            NewList.add(i);
        }
        return NewList;

    }


}
