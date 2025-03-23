package OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 =  new Box();
////        System.out.println(box.l + " " + box.b + " " + box.h);
////        Box b1 = new Box(1,2,3);
//        Box s1 = new Box(box1);
//        System.out.println(s1.l);
//
//        WeightedBox b5 = new WeightedBox(2,3,4,8);
////        System.out.println(b5.weight);
//
//        WeightedBox f = new WeightedBox(b5);
//        System.out.println(f.weight);

        BoxPrice newBox = new BoxPrice(1,2,3,4,5);
//        this will call the constructor of the boxPrice taking 5 arguments
        System.out.println(newBox.cost);
    }
}
