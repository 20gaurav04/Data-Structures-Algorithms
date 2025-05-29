package LinkedLists;
//import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

//        Singly LL
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(43);
//        list.insertFirst(21);
//        list.insertFirst(124);
//
//        list.insertLast(95);
//        list.insertFirst(85);
//
//        list.insert(54,2);
//        list.deleteFirst();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(2));
//        list.display();
//
//        System.out.println(list.find(43));

//      Doubly LL

          DLL list = new DLL();
         list.insertFirst(5);
         list.insertFirst(43);
         list.insertFirst(21);
         list.insertFirst(124);

         list.insertLast(22);

         list.insert(43,2);
//         list.display();
//         list.insert(1,7);

         list.deleteFirst();
         list.display();
    }
}
