package OOPS.AbstractDemo;

public class Daughter extends Parent{

    Daughter(int age)
    {
        super(age);
    }

    @Override
    public  void career()
    {
        System.out.println("I want to be a chef");
    }
    @Override
    public void hobby()
    {
        System.out.println("My hobby is to dance");
    }
}
