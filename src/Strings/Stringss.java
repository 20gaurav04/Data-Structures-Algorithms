package Strings;

public class Stringss {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
//        string builder is mutable and unlike strings it modifies the original object itself
        sb.deleteCharAt(2); // Deletes the character at index 2
        sb.append("hello");
        sb.insert(0,"y");
        System.out.println(sb);
        String str = "Greatest Of All Time ";
        for (char ch : str.toCharArray()) {
            System.out.print(ch);
        }


    }
}
