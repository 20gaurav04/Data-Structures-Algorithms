package LinkedLists;

public class CLL {


    private Node head;
    private Node tail;


    public CLL()
    {
        this.head = null;
        this.tail = null;
    }


    public void insert(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display()
    {
        Node temp = head;
        if(head!=null)
        {
            do
            {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println("HEAD");
        }
    public void delete(int data) {
        Node node = head;
        if (node == null) return;

        if (node.data == data) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if (n.data == data) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
    private class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
}
