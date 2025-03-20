package OOPS;

public class This {
    public static void main(String[] args) {
        Student1 gaurav = new Student1();
        Student1 aura = new Student1("glow",41,44.f);
//        System.out.println(gaurav.name + gaurav.roll);
//        System.out.println(aura.name);
//        System.out.println(aura.roll);
//        System.out.println(aura.marks);
        Student1 random = new Student1();
        System.out.println(random.name);
        final int a = 5;
//        a=24; cannot modify it
        final Student1 as = new Student1();
        as.name = "ava";
//        as = new Student1(); cannot reassign
        System.out.println(as.name);

    }
}
class Student1
{
    int roll;
    String name;
    float marks;

    Student1() {
        this("jack",42,52.f);
//        constructor is being called by the constructor
    }
    Student1(String names,int rolls , float markss)
    {
        this.name = names;
        this.roll = rolls;
        this.marks = markss;
    }



}
