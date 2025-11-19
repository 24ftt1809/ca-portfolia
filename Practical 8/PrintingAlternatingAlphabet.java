public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        
        char[] alphabet = new char[26];

        
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)('a' + i);
        }

        
        for (int i = 0, j = 25; i <= j; i++, j--) {
            if (i == j) {
                System.out.print(alphabet[i] + " ");
            } else {
                System.out.print(alphabet[i] + " " + alphabet[j] + " ");
            }
        }
    }
}
