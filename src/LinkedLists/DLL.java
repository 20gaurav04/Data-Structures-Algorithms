package LinkedLists;

public class DLL {

    private Node head;

    public void insertFirst(int data)
    {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null) head.prev = node;
        head = node;
    }
    public void insertLast(int data)
    {
        Node node = new Node(data);
        Node last = head;
        node.next = null;
        if(head==null)
        {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after , int data)
    {
        Node p = find(after);
        if(p==null){
            System.out.println("Provided node does not Exists");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.next!=null) node.next.prev = node;
    }
    public Node find(int val)
    {
        Node searchingItem = head;
        while(searchingItem!=null)
        {
            if(searchingItem.data==val)
            {
                return searchingItem;
            }
            searchingItem = searchingItem.next;
        }
        return null;
    }
    public void deleteFirst()
    {
        if(head==null) return;
        if(head.next == null) head = null;

        else{
            head = head.next;
            head.prev = null;
        }

    }
    public void display()
    {
        Node node = head;
        Node last = null;
        while(node!=null)
        {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;

        }
        System.out.println("END");

        System.out.println("In Reverse Order : ");
        while(last!=null)
        {
            System.out.print(last.data + " <- ");
            last = last.prev;
        }
        System.out.println("START");

    }
    private class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
        }
//
//        public Node(int data , Node next , Node prev)
//        {
//            this.data = data;
//            this.next = next;
//            this.prev = prev;
//        }
    }
}

