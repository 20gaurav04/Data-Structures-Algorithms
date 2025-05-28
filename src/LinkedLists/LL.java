package LinkedLists;

import java.sql.SQLOutput;

public class LL {

    private Node head;
    private Node tail;
    private int  size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int data)
    {
        Node node =  new Node(data);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int data)
//            this extra variable "tail" allows insertion in O(1)
//            at the last , else it would take O(n)
    {
        if(tail == null)
        {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data + " -> " );
            temp = temp.next;
        }
        System.out.println("End");

    }
    private class Node {

        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data , Node next)
        {
            this.data = data;
            this.next = next;
        }

    }
}
