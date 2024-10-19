package Questions;
import java.util.List;
import java.util.ArrayList;

public class Pangram {
    public static void main(String[] args) {
        String x = "thequickbrownfoxjumpsoverthelazydog";
        System.out.print(checkIfPangram(x));
    }
    static boolean checkIfPangram(String sentence)
    {
        boolean [] arr = new boolean[26];

        for(int i = 0;i<sentence.length();i++)
        {
            arr[sentence.charAt(i)-'a']=true;
//            checking the ASCII Value , for ex if a is present then ASCII of a = 97 and 97-97 = 0 , that is at 0 index value will be true;
        }
        for(boolean curr : arr)
        {
            if(!curr)
            {
                return false;
            }
        }
        return true;
    }
}
