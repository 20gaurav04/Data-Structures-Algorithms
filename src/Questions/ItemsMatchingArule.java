package Questions;
import java.util.*;

public class ItemsMatchingArule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleVal = "gold";
        System.out.print(countMatches(items,ruleKey,ruleVal));
    }
    static  int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int idx=0,res=0;
        if(ruleKey.equals("type"))
        {
            idx=1;
        }
        else if(ruleKey.equals("color"))
        {
            idx=2;
        }
        else idx=3;

        for(int i =0;i<items.size();i++)
        {
            if(items.get(i).get(idx-1).equals(ruleValue))
            {
                res++;
            }
        }
        return res;
    }
}
