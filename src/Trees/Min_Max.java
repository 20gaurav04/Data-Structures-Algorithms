package Trees;

class TreeNode
{
    int data;
    TreeNode left , right;
    TreeNode(int value)
    {
        data  = value;
    }
}
public class Min_Max
{

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(124);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.left.left.left = new TreeNode(1);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);
        int[] result = findMinMax(root);
        System.out.println("Minimum value in tree: " + result[0]);
        System.out.println("Maximum value in tree: " + result[1]);

    }
    static int[] findMinMax(TreeNode root)
    {
        if(root==null)
            return new int[]{Integer.MAX_VALUE , Integer.MIN_VALUE};

        int[] left = findMinMax(root.left);
        int[] right = findMinMax(root.right);

        int min = Math.min(root.data , Math.min(left[0] , right[0]));
        int max = Math.max(root.data , Math.max(left[1] , right[1]));

        return new int[]{min,max};
    }
}