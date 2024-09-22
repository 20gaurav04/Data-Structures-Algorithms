package Switch;
import java.util.Scanner;

public class SwitchC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit : ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "apple":
                System.out.println("Its red and white");
                break;
                case "orange":
                    System.out.println("Its round and juicy");
                    break;
                    case "banana":
                        System.out.println("Its long and yellow");
                        break;
                        default:
                            System.out.println("Invalid fruit entered");
        }
    }
}