package Questions;

public class CheckIfNandItsDoubleExists {
    public static void main(String[] args) {
        int [] arr = {3,1,7,11};
        boolean res= checkifExist(arr);
        System.out.println(res);
    }
    static boolean checkifExist(int [] arr)
    {
        boolean ifExist = true;
        for(int i =0; i<arr.length ; i++)
        {
            for(int j=arr.length-1;j>=0;j--)
            {
                if(arr[i] == 2 * arr[j] && i!=j)

                    return ifExist = true;
            }
        }
        return false;
    }
}
