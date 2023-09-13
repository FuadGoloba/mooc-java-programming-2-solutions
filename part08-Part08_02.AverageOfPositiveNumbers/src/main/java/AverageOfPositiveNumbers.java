
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int number = Integer.valueOf(input);
            if (number > 0) {
                total += number;
                count += 1;
            }
        }
        if (total == 0) {
            System.out.println("Cannot calculate the average");
        }
        double average = total * 1.0 / count;
        System.out.println(average);

    }
}
