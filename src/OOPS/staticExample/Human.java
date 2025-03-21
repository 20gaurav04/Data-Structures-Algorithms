package OOPS.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long Population;

    Human(String name , int age , int salary , boolean married)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.Population +=1;
//        can also be accessed using 'this' keyword but the convention is to access it using className;
    }
}
