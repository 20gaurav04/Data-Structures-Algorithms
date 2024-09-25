package Arrays;

public class max {


    static int maximum(int [] arr , int max)
    {

        for(int i =0;i<5;i++)
        {

            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,7};
        int largest=maximum(arr,0);
        System.out.print("Largest element :"+" "+largest);
    }
}
