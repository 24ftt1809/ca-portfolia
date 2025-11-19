import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rounds = 0;       
        int userScore = 0;    
        int computerScore = 0; 
        String playAgain;     

        do {
            
            int computerChoice = (int) (Math.random() * 1000) % 3;

            
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = input.nextInt();

            String computerStr = (computerChoice == 0) ? "rock" : (computerChoice == 1) ? "paper" : "scissor";
            String userStr = (userChoice == 0) ? "rock" : (userChoice == 1) ? "paper" : "scissor";

            
            System.out.print("The computer is " + computerStr + ". You are " + userStr + ". ");

            
            if (userChoice == computerChoice) {
                System.out.println("It is a draw.");
            }
            if ((userChoice == 0 && computerChoice == 2) || 
                (userChoice == 1 && computerChoice == 0) || 
                (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            }
            if ((computerChoice == 0 && userChoice == 2) || 
                (computerChoice == 1 && userChoice == 0) || 
                (computerChoice == 2 && userChoice == 1)) {
                System.out.println("You lose.");
                computerScore++;
            }

            rounds++;

            
            System.out.print("Enter y to play again: ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        
        System.out.println("In the total of " + rounds + " round(s), You scored " + userScore + 
                           ", Computer scored " + computerScore);

        if (userScore > computerScore) {
            System.out.println("You won the game.");
        } else if (userScore < computerScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }

        input.close();
    }
}
