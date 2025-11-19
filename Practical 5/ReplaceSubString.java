import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter your message:");
        String message = input.nextLine();

        
        System.out.print("Enter the substring to replace: ");
        String oldSub = input.nextLine();

        
        System.out.print("Enter the replacement string: ");
        String newSub = input.nextLine();

        
        String updatedMessage = message.replace(oldSub, newSub);

        System.out.println("The updated message is:");
        System.out.println(updatedMessage);

        input.close();
    }
}
