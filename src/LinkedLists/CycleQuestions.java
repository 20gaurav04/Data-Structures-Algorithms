package LinkedLists;

public class CycleQuestions {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    public boolean hasCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;

            if(slow==fast) return true;
        }
        return false;
    }

    public int cycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            ListNode temp = slow;
            if (slow == fast) {
                do {
                    temp = temp.next;
                    length++;
                }
                while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;

            if(fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }
        if(length==0) return null;

        // finding cycle start

        ListNode first = head;
        ListNode second = head;

        while(length>0)
        {
            second = second.next;
            length--;
        }
//        keep moving both forward and they will meet at the start

        while(first!=second)
        {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
