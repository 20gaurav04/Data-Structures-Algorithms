package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {

       Human Gaurav = new  Human("Gaurav",20,98000,false);
       Human Harsh = new Human("Harsh",21,89000 , true);

        System.out.println(Harsh.salary);
        System.out.println(Human.Population);

//        greeting();
//        non-static method cannot be used inside a static method because a non-static method requires an object
//        whereas a static method doesn't require an object

//        here we are referencing its instance , therefore able to access it
        Main object = new Main();
        object.hello();

    }
    void hello()
    {
        greeting();
    }
    void greeting()
    {
        System.out.println("hello there!");
    }
}
