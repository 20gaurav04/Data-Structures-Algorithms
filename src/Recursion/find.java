package Recursion;
import java.util.*;

public class find {
    static boolean find(int[] arr , int index , int target)
    {
        if(index==arr.length) return false;

        return arr[index]==target || find(arr,index+1,target);

    }


    static List<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int index , int target) {
        if (index == arr.length) {
            return;
        } else if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, index + 1, target);
    }
    static ArrayList findAll(int[] arr , int index , int target , ArrayList<Integer>list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }

        return findAll(arr,index+1 , target , list);
    }

    public static void main(String[] args) {
        int [] arr =  { 1,2,3,3};
        int target = 3;
//        boolean res = find(arr,0,target);
//        System.out.println(res);
//        findAllIndex(arr,0,target);
//        System.out.println(list);
        List<Integer> resList = findAll(arr,0,target,new ArrayList<>());
        System.out.println(resList);

    }

}
