package Questions;

public class HighestAltitude {
    public static void main(String[] args) {
        int gain [] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain)
    {
        int peak =0;
        int max=0;
        for(int i =0;i<gain.length;i++)
        {
         peak+=gain[i];
         if(peak>max)
         {
             max=peak;
         }
        }
        return max;
    }
}
