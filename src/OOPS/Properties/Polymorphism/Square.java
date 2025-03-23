package OOPS.Properties.Polymorphism;

public class Square  extends Shape
{
     @Override
//     to check whether the method is being overridden or not , its just an annotation .
//     obviously when the object is created of square the area method of square overrides the shapes method
     void area()
    {
        System.out.println("Area is side^2");
    }
}
