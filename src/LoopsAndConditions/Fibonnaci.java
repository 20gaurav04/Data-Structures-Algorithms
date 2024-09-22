package LoopsAndConditions;

public class Fibonnaci{
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int count = 10;
        int i = 0;
        int n3;

        System.out.print(n1 + " " + n2);

        for(i=0;i<count;i++)
        {
            n3 = n1+n2;
            System.out.print(" " +n3 + " ");
            n1=n2;
            n2=n3;
        }
    }
}