package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = { 10,55,77,22,45};
        System.out.print(search(arr,220,1,3));
    }

    static int search(int [] arr , int target , int start , int end)
    {
        if(arr.length==0)
            return -1;
        for(int i = start ; i<=end;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return-1;
    }
}

