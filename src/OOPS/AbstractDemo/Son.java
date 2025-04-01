package OOPS.AbstractDemo;

public class Son extends Parent{


    Son(int marks)
    {
        super(marks);
    }
    @Override
    public  void career()
    {
        System.out.println("I want to be a developer");
    }
    @Override
    public void hobby()
    {
        System.out.println("My hobby is to sing");
    }
}
