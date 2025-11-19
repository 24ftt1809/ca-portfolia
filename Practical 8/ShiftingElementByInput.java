import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("How many numbers are there?");
        int n = sc.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        
        System.out.println("Enter number of left shift:");
        int shifts = sc.nextInt();


        shifts = shifts % n;
        for (int s = 0; s < shifts; s++) {
            int first = numbers[0];
            for (int i = 0; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[n - 1] = first;
        }

        
        System.out.println("The shifted arrangement is:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
