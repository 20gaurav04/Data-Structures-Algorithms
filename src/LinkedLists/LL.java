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
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail==null) tail = head;
        size++;
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

    public void insert(int data , int index)
    {
        if(index==0)
        {
            insertFirst(data);
            return;
        }
        if(index==size)
        {
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i<index;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next = node;

        size++;
    }
    public void insertRec(int data , int index)
    {
        head = insertRec(data , index , head);
    }
    private Node insertRec(int data , int index , Node node)
    {
        if(index==0)
        {
            Node temp = new Node(data , node);
            size++;
            return temp;
        }
        node.next = insertRec(data , --index ,node.next);
        return node;
    }
    public int deleteFirst()
    {
        if(size==0)
        {
            return -1;
        }
        int val = head.data;
        Node temp = head;
        head = temp.next;
        size--;
        if(head==null) tail=null;
        return val;
    }

    public int deleteLast() {
        if(size<=1)
        {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }
        Node prev = get(index -1 );
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;

    }
    public Node get(int index)
    {
        Node node = head;
        for(int i = 0 ; i<index;i++)
        {
            node = node.next;
        }
        return node;
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
    public Node  find(int val)
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

        @Override
        public String toString() {
            return "Node(data=" + data + ")";
        }
    }

    // question

    public void removeDuplicate()
    {
//        O(n) Time Complexity
        Node node = head;

        while(node.next != null)
        {
            if(node.data == node.next.data)
            {
                node.next = node.next.next;
                size--;
            }
            else
            {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//    merging 2 sorted lists;
    public LL merge(LL first , LL second)
    {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f.next != null && s.next !=null)
        {
            if(f.data <= s.data)
            {
                ans.insertLast(f.data);
                f = f.next;
            }
            else
            {
                ans.insertLast(s.data);
                s = s.next;
            }
        }
//        only 1 of the while loops will run in case of the size of 2 lists are not same
        while(f.next !=null)
        {
            ans.insertLast(f.data);
            f = f.next;
        }
        while(s.next !=null)
        {
            ans.insertLast(s.data);
            s = s.next;
        }
        return ans;
    }


    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.display();
//        list.removeDuplicate();
//        list.display();
        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        LL list2 = new LL();
        list2.insertLast(1);
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(9);

        LL ans = list1.merge(list1 , list2);
        ans.display();
    }

}

