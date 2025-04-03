package OOPS.Interfaces.Nested;

public class A {

    public interface nestedOne
    {
        boolean isOdd(int n);
    }
}
class B implements A.nestedOne
{
    @Override
    public boolean isOdd(int n)
    {
        return (n&1)==1;
    }
}
class Main
{
    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.isOdd(6));
    }
}
