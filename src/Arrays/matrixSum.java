package Arrays;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class matrixSum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("rows:");
            int rows = sc.nextInt();
            System.out.print("cols:");
            int cols = sc.nextInt();
            int sum = 0;
            int[][] arr = new int[rows][cols];

            for(int i = 0; i<rows ; i++)
            {
                for(int j = 0; j<cols;j++)
                {
                    System.out.print("enter elements:");
                    arr[i][j]=sc.nextInt();

                }
            }
            for(int i = 0 ; i<rows;i++)
            {
                for(int j = 0 ; j<cols;j++)
                {
                    if(i==j)
                    {
                        sum+=arr[i][j];
                    }
                }
            }
            System.out.print(sum);
        }
    }
