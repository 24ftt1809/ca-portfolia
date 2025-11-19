import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        
        for (int i = 0; i < numbers.length; i++) {
            int j = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        int chances = 10;
        boolean won = false;

        
        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = sc.nextInt();
            }

            
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            
            chances--;
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
                break;
            } else if (chances > 0) {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }

        
        if (!won) {
            System.out.print("The actual number is ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println(". You Lose.");
        }
    }
}
