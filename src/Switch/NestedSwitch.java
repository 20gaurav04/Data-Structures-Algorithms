package Switch;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();

        switch (n)
        {
            case 1:
                System.out.println("Gaurav");
                break;
            case 2 :
                System.out.println("Vinod");
                break;
            case 3 :
                switch(x) {
                    case "IT":
                        System.out.println("Good");
                        break;
                    case "CS":
                        System.out.println("better");
                        break;
                    default:
                        System.out.println("not a valid deptarment");
                }break;
            default:
                System.out.println("not a number");

                }
        }
    }
