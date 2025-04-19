package OOPS.Generics;

public class Test<T> {
    T obj;
    Test( T obj)
    {
        this.obj = obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}
class Main
{
    public static void main(String[] args) {
        Test<Integer> s1 = new Test<Integer>(15);
        System.out.println(s1.getObject());

        Test<String> s2 = new Test<String>("hello");
        System.out.println(s2.getObject());
    }
}
