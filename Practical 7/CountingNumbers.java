import java.util.Scanner;
import java.text.DecimalFormat;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int numberCount = 0;
        double average;

        System.out.println("Enter an integer, the input ends if it is 0:");

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            total += number;
            numberCount++;

            if (number > 0) {
                positiveCount++;
            } 
            if (number < 0) {
                negativeCount++;
            }
        }

        if (numberCount == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
        } else {
            average = (double) total / numberCount;
            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("The number of positive is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.println("The average is " + df.format(average));
        }

        input.close();
    }
}
