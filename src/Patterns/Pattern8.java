package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n =4;
        Pattern8(n);
    }
    static void Pattern8(int n)
    {
        int len = 2*n;
        int originalN = n;
        for(int row=0;row<=len;row++) {
            for (int cols = 0;cols <=len; cols++)
            {
                int valAtEveryIndex = originalN- Math.min(Math.min(row,cols),Math.min(len-row,len-cols));
                System.out.print(valAtEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
