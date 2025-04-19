package OOPS.ExceptionHandling;

public class MAIN {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{String name = "Gaurav";
        if(name.equals("Gaurav"))
        {
            throw new MyException("Your name is Gaurav");
        }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            divide(a,b);
        }
        catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        finally
        {
            System.out.println("This will always be executed");
        }
    }
    static int divide (int a  , int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("don't divide by zero buddy");
        }
        return a/b;
    }
}
