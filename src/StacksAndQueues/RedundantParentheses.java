package StacksAndQueues;
import java.util.Stack;

public class RedundantParentheses {
    public static void main(String[] args) {
        String s = "b";
        System.out.println(isRedundant(s));
    }
    static boolean isRedundant(String s)
    {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='+' || ch=='-' || ch=='/' || ch=='*')
            {
                stk.push(ch);
            }
            else{
//                either we get a closing bracket or any alphabets
                if(ch==')')
                {
                    boolean redundant = true;
                    char top = stk.peek();
                    while(!stk.isEmpty() && stk.peek() != '('){
                        stk.pop();
                        if(top=='+' || top=='/' || top=='*' || top=='-') {
                            redundant = false;
                        }
                    }
                    if (!stk.isEmpty()) {
                        stk.pop(); // remove the '('
                    }

                    if (redundant) {
                        return true; // Redundant found
                    }
                }
            }
        }
        return false;

    }
}
