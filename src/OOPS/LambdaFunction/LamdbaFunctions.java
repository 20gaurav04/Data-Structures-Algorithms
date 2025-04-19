package OOPS.LambdaFunction;

import java.util.ArrayList;

public class LamdbaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< 5 ; i++)
        {
            res.add(i+1);
        }
        res.forEach((item) ->{
            System.out.println(item*2);
        });
//        basically like an arrow function in js
    }

}
