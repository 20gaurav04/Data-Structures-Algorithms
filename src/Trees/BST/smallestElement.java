package Trees.BST;
import java.util.*;




class Tree
{
    Tree left , right;
    int data;

    Tree(int data)
    {
        this.data = data;
    }
}
public class smallestElement {
    Tree root;
    smallestElement()
    {
        root = null;
    }
    Tree create(Tree root , int data)
    {
        if(root==null)
        {
            root = new Tree(data);
            return root;
        }
        if(root.data>data)
        {
            root.left = create(root.left,data);
        }
        else
        {
            root.right = create(root.right,data);

        }
        return root;
    }
    static int min = Integer.MAX_VALUE;
    void print(Tree root)
    {
        if(root==null) return;
        if(root.data<min)
        {
         min = root.data;
        }
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        smallestElement sol = new smallestElement();
        int n = sc.nextInt();
        for(int i = 0 ; i<n;i++)
        {
            int c = sc.nextInt();
            sol.root = sol.create(sol.root,c);
        }
        sol.print(sol.root);
        System.out.print(min);
    }

}
