package Questions;

class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] arr = { 1,2,1,1,3};
        System.out.print(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int [] arr)
    {
        int res=0;
        int [] countArray = new int[101];
        for(int num : arr)
        {
            countArray[num]++;
        }
        for(int count :countArray)
        {
            count = (count*(count-1))/2;
            res+=count;
        }
        return res;
    }
}
