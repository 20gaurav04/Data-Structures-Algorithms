package Questions;
import java.util.Arrays;

public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int [] smallerNumbersThanCurrent(int [] arr)
    {
        int [] x = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for (int j =0;j<arr.length;j++) {
                if (arr[i]>arr[j])
                {
                    count++;
                }
                x[i]=count;
            }
        }
        return x;
    }
}