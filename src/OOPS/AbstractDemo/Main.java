package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {

//        Parent p1 = new Parent();
//        The object cannot be instantiated as it is a abstract class.
        Son son = new Son(35);
        son.career();

        Daughter daughter = new Daughter(66);
        daughter.hobby();
    }
}
