package OOPS;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//        String name = "Gaurav";
//        int roll = 25;
//        float marks = 41.f;


            Student[] name = new Student[5];
//    new keyword is basically used for dynamic memory allocation for new object in heap and also initialises it

//            System.out.println(Arrays.toString(name));
        Student Gaurav = new Student();
        System.out.println(Gaurav);
        System.out.println(Gaurav.roll);
//        the dot here signifies the roll inside the object gaurav;
        System.out.println(Gaurav.name);
        System.out.println(Gaurav.marks);
        Gaurav.greeting();
        }
}
class Student
{
    int roll;
    String name = "Gaurav";
    float marks = 35.f;

    void greeting()
    {
        System.out.println("Hello ji " + name);
    }

    Student()
//            Default Constructor doesnt require the return type as obviously it would return the class.
    {
        this.roll = 25;
        this.name = "saurav";
        this.marks = 35.5f;
    }

}
