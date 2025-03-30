package OOPS.Specifiers;

public class A {
    private int num = 5;
    String name;
    int[] arr;

    public int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public A(int n ,String name)
    {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
class B
{
    public static void main(String[] args) {
        A obj = new A(2,"TA");
        obj.getNum();
        System.out.println(obj.name);
    }
}
class C extends A {
    public C(int n, String name) {
        super(n, name);
    }

    public static void main(String[] args) {
        C a = new C(2,"Afs");
    }
}