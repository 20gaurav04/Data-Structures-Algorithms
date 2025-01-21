package Recursion;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
//        permutation(p,up);
        ArrayList<String> ans = new ArrayList<>(perms(p,up));
        System.out.println(ans);
    }

    static void permutation(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0 ; i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> perms(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0 ; i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(perms(f+ch+s,up.substring(1)));
        }
        return ans;
    }
}
