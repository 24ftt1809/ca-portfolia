import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter name: ");
        String name = input.nextLine();

        
        String upperName = name.toUpperCase();

        
        File folder = new File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        
        File file = new File(folder, "QReceipt.txt");
        FileWriter writer = new FileWriter(file, true);

        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(formatter);

        
        int queueNumber = (int) (Math.random() * 999) + 1;

        
        writer.write("Date & Time: " + dateTime + "\r\n");
        writer.write("Welcome " + upperName + "!\r\n");
        writer.write("Your Queue Number: " + queueNumber + "\r\n");
        writer.write("-------------------------------------\r\n");

        writer.close();

        
        System.out.println("Receipt generated. Thank you.");

        input.close();
    }
}
