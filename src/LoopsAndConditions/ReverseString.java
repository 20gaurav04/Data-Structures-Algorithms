package LoopsAndConditions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Inputted String : "+" "+str);
        char ch;

        String nstr=" ";
        for (int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("LoopingStatements.Reverse Of String: "+" "+nstr);
    }
}