package OOPS.Cloning;
import java.lang.Object;
import java.util.Arrays;

public class MAIN {

    public static void main(String[] args)  throws CloneNotSupportedException{
        Human h1 = new Human(20 , "Gaurav");

        Human twin = (Human)h1.clone();

//        new creates overhead so instead we can clone objects with lesser overhead
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[4] = 24;

        System.out.println(Arrays.toString(h1.arr));
    }

}
