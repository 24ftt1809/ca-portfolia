import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int num3 = (int)(Math.random() * 100);
        int num4 = (int)(Math.random() * 100);

        
        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + "?");
        int userSum = input.nextInt();

        
        int actualSum = num1 + num2 + num3 + num4;

        
        if (userSum == actualSum) {
            System.out.println("Well done, you are correct!");
        } else {
            System.out.println("Nice try, the sum should be " + actualSum);
        }

        input.close();
    }
}
