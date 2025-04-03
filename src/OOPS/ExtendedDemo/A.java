package OOPS.ExtendedDemo;

public interface A extends B {

    default void greet()
    {
        System.out.println("greetings");
    }

    static void hello()
    {
        System.out.println("hello");
    }
//    static methods should always have a body
}
