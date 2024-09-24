package Arrays;
import java.util.Arrays;

public class MutableArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        mutable(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void mutable(int[] arr)
    {
       arr[0]=55;
    }
}
