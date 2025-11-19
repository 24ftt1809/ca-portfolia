import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        boolean playerTurn = true;
        boolean gameEnd = false;

        while (!gameEnd) {
            printBoard(board);

            if (playerTurn) {
                System.out.println("Player's turn");
                int row, col;
                while (true) {
                    System.out.print("Enter a row (0,1 or 2): ");
                    row = sc.nextInt();
                    System.out.print("Enter a column (0,1 or 2): ");
                    col = sc.nextInt();
                    if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ') {
                        board[row][col] = 'X';
                        break;
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                }
            } else {
                System.out.println("Computer's turn");
                int row, col;
                while (true) {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                    if (board[row][col] == ' ') {
                        board[row][col] = 'O';
                        break;
                    }
                }
            }

            
            if (checkWin(board, playerTurn ? 'X' : 'O')) {
                printBoard(board);
                if (playerTurn) {
                    System.out.println("Game ended, Player Win");
                } else {
                    System.out.println("Game ended, CPU Win");
                }
                gameEnd = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Game ended, Draw");
                gameEnd = true;
            }

            playerTurn = !playerTurn;
        }

        sc.close();
    }

    
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.print(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2) System.out.println("\n---------");
        }
        System.out.println();
    }

    
    public static boolean checkWin(char[][] board, char symbol) {
        
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
