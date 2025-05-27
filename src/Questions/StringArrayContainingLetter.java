package Questions;
import java.util.*;
//https://leetcode.com/problems/find-words-containing-character/?envType=daily-question&envId=2025-05-27
public class StringArrayContainingLetter {
    public static void main(String[] args) {
        String[] arr = {"hello","lmao","crazy","oppenheimer"};
        char x = 'a';
        System.out.println(findWordsContaining(arr,x));
    }
    static List<Integer> findWordsContaining(String[] arr , char x)
    {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i].contains(String.valueOf(x))){
//                String.valueOf will check that whatever x is containing belongs to that particular string
                lst.add(i);
            }
        }
        return lst;
    }
}
