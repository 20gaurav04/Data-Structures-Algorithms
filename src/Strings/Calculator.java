package Strings;

public class Calculator {
    public static void main(String[] args) {
        String calc = "3+2*2";
        int res = calculator(calc);
        System.out.println(res);
    }
    static int calculator(String calc)
    {
        int number = 0;
        for(int i = 0 ; i<calc.length();i++)
        {
            if(calc.charAt(i)=='+'){
                number = (int)(calc.charAt(i-1)  +  (int)calc.charAt(i-1));
            }
            else if(calc.charAt(i)=='-'){
                number = (int)(calc.charAt(i-1)  - (int)calc.charAt(i+1));
            }
            else if(calc.charAt(i)=='*'){
                number = (int)(calc.charAt(i-1) * (int)calc.charAt(i+1));
            }
            else if(calc.charAt(i)=='/'){
                number = (int)(calc.charAt(i-1)/ (int)calc.charAt(i+1));
            }
        }
        return number;
    }
}
