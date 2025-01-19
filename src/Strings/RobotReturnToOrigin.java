package Strings;
//https://leetcode.com/problems/robot-return-to-origin/description/

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String s = "UDL";
        boolean res = judgeCircle(s);
        System.out.println(res);
    }
    static boolean judgeCircle(String s)
    {
        int countUp = 0;
        int countDown = 0;
        int countLeft = 0;
        int countRight = 0;

        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch=='U'|| ch=='u')
            {
                countUp++;
            }
            else if(ch=='D'||ch=='d'){
                countDown++;
            }
            else if(ch=='R'||ch=='r')
            {
                countRight++;
            }
            else if(ch=='l'|| ch=='L')
            {
                countLeft++;
            }
        }
        return (countLeft==countRight && countUp==countDown);
    }
}
