package Trees;

import java.util.Stack;

class Trees
{
    Trees left , right;
    int data;
    Trees(int val)
    {
        data = val;
    }
}
public class MinMaxUsingDFS {
    public static void main(String[] args) {
        Trees root = new Trees(5);
        root.left = new Trees(7);
        root.right = new Trees(3);
        root.left.left = new Trees(12);
        root.left.right = new Trees(24);
        root.right.left = new Trees(2);
        root.right.right = new Trees(15);

        int[] result = findMinMax(root);
        System.out.println("Min Value :  " + result[0]);
        System.out.println("Max Value : " + result[1]);
    }
    static int[] findMinMax(Trees root)
    {
        if(root == null)
        {
            return new int[]{Integer.MIN_VALUE , Integer.MAX_VALUE};
        }
        Stack<Trees> stack = new Stack<>();
        stack.push(root);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(!stack.isEmpty())
        {
            Trees current = stack.pop();
            if (current.data < min) min = current.data;
            if (current.data > max) max = current.data;

            // Push children (order doesn't matter for min/max)
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }

        return new int[]{min, max};
        }
    }