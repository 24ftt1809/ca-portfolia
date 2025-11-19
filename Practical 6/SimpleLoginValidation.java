import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        
        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        
        System.out.print("Please enter the password: ");
        String password = input.nextLine();

        
        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String timeString = now.format(formatter);

                System.out.println("Welcome " + username + ". The time now is " + timeString);
            } else {
                System.out.println("Error: Password does not match.");
            }
        } else {
            System.out.println("Error: Invalid Username.");
        }

        input.close();
    }
}
