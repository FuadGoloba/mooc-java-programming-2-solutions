
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int max = 100;

        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if ((command.equals("add")) && (amount > 0)) {
                first = first + amount;
                if (first > max) {
                    first = max;
                }
            }

            if ((command.equals("move")) && (amount > 0)) {
                if (amount > first) {
                    amount = first;
                }
 
                first = first - amount;
                second = second + amount;
 
                if (second > max) {
                    second = max;
                }
            }

            if ((command.equals("remove")) && (amount > 0)) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }
            System.out.println("");
        }
    }

}
