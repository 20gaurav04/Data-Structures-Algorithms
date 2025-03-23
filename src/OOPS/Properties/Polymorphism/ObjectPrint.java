package OOPS.Properties.Polymorphism;

public class ObjectPrint {

    int num;

        ObjectPrint(int num)
        {
            this.num = num;
        }
        @Override
        public String toString()
        {
            return "ObjectPrint{" + "num : " + num + '}';
        }

    public static void main(String[] args) {
        ObjectPrint s1 = new ObjectPrint(54);
        System.out.println(s1);
//        here it is  calling the object's class toString() method as there is no toString() method existing.
    }
}
