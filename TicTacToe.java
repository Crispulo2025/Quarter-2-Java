import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    // Initialize the board with empty spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Display the board
    public static void displayBoard() {
        System.out.println("\nTic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Place X or O on the board
    public static boolean placeMark(int row, int col, char mark) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid position!");
            return false;
        }

        if (board[row][col] == '-') {
            board[row][col] = mark;
            return true;
        } else {
            System.out.println("Position already taken!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

        char currentPlayer = 'X';
        int moves = 0;

        while (moves < 9) {
            displayBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (0–2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (placeMark(row, col, currentPlayer)) {
                moves++;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        displayBoard();
        System.out.println("Game over!");
        scanner.close();
    }
}
