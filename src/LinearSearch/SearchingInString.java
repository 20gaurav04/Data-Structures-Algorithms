package LinearSearch;
import java.util.Arrays;

public class SearchingInString {
    public static void main(String[] args) {
        String name = "gaurav";
        char target = 'a';
//        System.out.print(find(name,target));
        System.out.print(Arrays.toString(name.toCharArray()));
    }

    static boolean find(String name , char target)
    {
        if(name.length()==0)
        {
            return false;
        }

        for(char ch : name.toCharArray())
        {
            if(ch==target)
                return true;
        }
//        for(int i=0;i<name.length();i++)
//        {
//            if(target==name.charAt(i))
//            {
//                return true;
//            }
//        }
        return false;
    }
}
