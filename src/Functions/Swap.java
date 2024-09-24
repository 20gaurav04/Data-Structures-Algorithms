package Functions;
public class Swap {
    public static void main(String[] args) {
        int n1=55;
        int n2=65;
        swap(n1,n2);
        System.out.println(n1+" "+n2);
    }
    static void swap(int num1,int num2)
    {
        num2=num1;
        num1=num2;


    }

}