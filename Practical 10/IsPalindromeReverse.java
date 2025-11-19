import java.util.Scanner;

public class IsPalindromeReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int number = 100 + (int)(Math.random() * 900);
        int reversedNumber = reverse(number);

        
        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = sc.nextInt();

        
        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = sc.nextInt();
        }

        
        boolean result = isPalindrome(userInput, reversedNumber);
        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + result);

        sc.close();
    }

    
    public static int reverse(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        return units * 100 + tens * 10 + hundreds;
    }

    
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}
