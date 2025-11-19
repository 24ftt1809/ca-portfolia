import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bytes;
        int bits;

        System.out.print("Enter the number of byte(s) to be converted: ");
        bytes = input.nextInt();

        bits = bytes * 8;

        System.out.println(bytes + " byte(s) is " + bits + " bits.");
    }
}
