package OOPS.Cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human(int age , String name)
    {
        this.age = age;
        this.name = name;
        this.arr = new int[] { 1,2,3,4,5};
    }

    public Object clone() throws CloneNotSupportedException{
//        shallow copying
        return super.clone();
    }
}
