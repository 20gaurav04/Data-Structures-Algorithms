package OOPS.Specifiers;
import java.lang.*;
public class ObjectDemo {
    int num;

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return super.toString();
    }

    ObjectDemo(int num)
    {
        this.num = num;
    }
    public static void main(String[] args) {
        ObjectDemo a = new ObjectDemo(34);
//        System.out.println(a.hashCode());
//        Giving the hashValue , and it varies based on objects and not on the value provided to identify
//        the uniqueness of the object.

        ObjectDemo obj1 = new ObjectDemo(9);
        ObjectDemo obj2 = new ObjectDemo(9);

        if(obj1==obj2) System.out.println("eqauls");
//        checks whether the variable are pointing to the same object
        if(obj1.equals(obj2)) System.out.println("equals");
//        checks the actual value through method

        System.out.println(obj1 instanceof  Object);
//        checks whether an object is instanceof a particular class.

        System.out.println(obj1.getClass());
//        it will return the class location  which will be store in the heap
    }

}
