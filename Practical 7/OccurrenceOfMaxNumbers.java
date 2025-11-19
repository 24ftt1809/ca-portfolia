import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int largest = Integer.MIN_VALUE;
        int count = 0;    

        System.out.println("Enter numbers, the input ends with 0 entered:");

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break; 
            }

            if (num > largest) {
                largest = num; 
                count = 1;     
            } else if (num == largest) {
                count++;       
            }
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        }

        input.close();
    }
}
