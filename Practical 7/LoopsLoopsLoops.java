public class LoopsLoopsLoops {
    public static void main(String[] args) {
        
        System.out.println("Below is generated using while loop:");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        
        System.out.println("Below is generated using dowhile loop:");
        int j = 50;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 35);
        System.out.println();

        
        System.out.println("Below is generated using for loop:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
