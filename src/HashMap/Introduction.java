package HashMap;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
//        Stores in the form of key-value pairs

        map.put(1,"Gaurav");
        map.put(2,"Saurav");
        map.put(3,"Jiya");
        map.putIfAbsent(4,"Hem");
        map.put(5,null);

        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Om"));
        System.out.println(map.get(1));
        boolean removed = map.remove(1,"Mohena");
        System.out.println("remove" + " " + removed);

        System.out.println(map.getOrDefault(5,"ohh"));
    }
}
