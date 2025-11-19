import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int choice = input.nextInt();

        
        System.out.print("Enter the amount to be converted: $");
        double amount = input.nextDouble();

        
        double result = (choice == 1) ? (amount * 3) : (amount / 3);

        
        System.out.printf("The change is $%.2f\n", result);

        input.close();
    }
}
