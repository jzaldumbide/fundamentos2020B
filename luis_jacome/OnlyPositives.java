
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.nextLine());

            if (numb < 0) {
                System.out.println("Unsuitable number");
            } else if (numb == 0) {
                break;
            } else {
                System.out.println(numb * numb);
            }
        }

    }
}
