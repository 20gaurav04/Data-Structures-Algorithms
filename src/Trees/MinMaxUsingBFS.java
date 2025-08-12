package Trees;
import java.util.*;
class Tree
{
    Tree left , right;
    int data;
    Tree(int val)
    {
        data = val;
    }

}
public class MinMaxUsingBFS {
    public static void main(String[] args) {
        Tree root = new Tree(5);
        root.left = new Tree(7);
        root.right = new Tree(3);
        root.left.left = new Tree(12);
        root.left.right = new Tree(24);
        root.right.left = new Tree(2);
        root.right.right = new Tree(15);

        int[] result = findMinMax(root);
        System.out.println("Min Value :  " + result[0]);
        System.out.println("Max Value : " + result[1]);
    }
    static int[] findMinMax(Tree root)
    {
        if(root==null)
        {
            return new int[]{Integer.MIN_VALUE , Integer.MAX_VALUE};
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty())
        {
            Tree current = queue.poll();

            if(current.data < min)
            {
                min = current.data;
            }
            if (current.data > max)
            {
                max = current.data;
            }
            if(current.left !=null) queue.add(current.left);
            if(current.right !=null) queue.add(current.right);
        }
        return new int[] { min , max};
    }

}
