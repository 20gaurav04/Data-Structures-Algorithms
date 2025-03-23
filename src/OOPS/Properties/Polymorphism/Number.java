package OOPS.Properties.Polymorphism;

public class Number {

    static int add(int a , int b)
    {
        return a+b;
    }
     int add(int a , int b , int c)
    {
        return a+b+c;
    }
    static void add()
    {
        System.out.println("performing addition");
    }
//    here the method name is same but either the return type is different or the parameters are different
//    know as method overloading;
public static void main(String[] args) {
    int a =5;
    int b = 4;
    add(a,b);
    Number n = new Number();
    System.out.println(n.add(1,2,3));
    add();
}
}
