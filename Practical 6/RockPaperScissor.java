import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int userChoice = input.nextInt();

        
        int computerChoice = (int)(Math.random() * 1000) % 3;

        
        String[] choices = {"rock", "paper", "scissor"};

        System.out.print("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ". ");

        
        switch (computerChoice) {
            case 0: 
                switch (userChoice) {
                    case 0 -> System.out.println("It is a draw.");
                    case 1 -> System.out.println("You Win.");
                    case 2 -> System.out.println("You Lose.");
                }
                break;
            case 1: 
                switch (userChoice) {
                    case 0 -> System.out.println("You Lose.");
                    case 1 -> System.out.println("It is a draw.");
                    case 2 -> System.out.println("You Win.");
                }
                break;
            case 2: 
                switch (userChoice) {
                    case 0 -> System.out.println("You Win.");
                    case 1 -> System.out.println("You Lose.");
                    case 2 -> System.out.println("It is a draw.");
                }
                break;
        }

        input.close();
    }
}
