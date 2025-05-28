package LinkedLists;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(43);
        list.insertFirst(21);
        list.insertFirst(124);

        list.insertLast(95);
        list.insertFirst(85);

        list.display();
    }
}
