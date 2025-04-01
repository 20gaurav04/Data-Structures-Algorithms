package OOPS.AbstractDemo;

public abstract class Parent {

    final int age;
    int marks;

    Parent(int marks)
    {
        this.marks = marks;
        age =35;
    }
    abstract void career();
    abstract void hobby();
}
