package Arrays;
import java.util.*;
public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,1,3,7};
        List<List<Integer>> result = getFrequencies(arr);
        System.out.println(result);

    }
    static List<List<Integer>> getFrequencies(int[] arr)
    {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr)
        {
            map.put(i , map.getOrDefault(i,0) + 1);
        }

        List<List<Integer>> freqList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freqList.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return freqList;
    }
}
