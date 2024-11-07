package BitwiseOperators;

public class OccurrenceInArray {
    public static void main(String[] args) {
        int [] arr  =  { 1,5,7,3,5,1,7};
        int x = check(arr);
        System.out.print(x);
    }
    static int check(int[] arr)
    {
        int unique = 0;
        for(int n : arr)
        {
            unique ^= n;
        }
        return unique;
    }
}
