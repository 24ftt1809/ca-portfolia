import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 101); 
        int num2 = (int) (Math.random() * 101);

        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int userSum = input.nextInt();

        int correctSum = num1 + num2;
        boolean isSumCorrect = (userSum == correctSum);

        System.out.println(num1 + " + " + num2 + " = " + userSum + " is " + isSumCorrect);

        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int userMod = input.nextInt();

        int correctMod = num1 % num2;
        boolean isModCorrect = (userMod == correctMod);

        System.out.println(num1 + " % " + num2 + " = " + userMod + " is " + isModCorrect);

        input.close();
    }
}
