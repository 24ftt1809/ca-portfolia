import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {

        
        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);

        
        String question = "What is " + num1 + " % " + num2 + " ?\r\n";

       
        File folder = new File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        
        File file = new File(folder, "Modulus Questions.txt");

        
        FileWriter writer = new FileWriter(file, true);
        writer.write(question);
        writer.close();

        
        System.out.println("A new question added");
    }
}
