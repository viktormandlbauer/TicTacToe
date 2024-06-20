import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {

    private Player player1, player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    private void switchCurrentPlay() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private int scanRow() {

        boolean isValid;
        Scanner scanner = new Scanner(System.in);
        int row = 0;

        isValid = false;
        while (!isValid) {
            System.out.print("ROW (1-3): ");
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (row <= 3 && row > 0) {
                    isValid = true;
                }
            } else {
                scanner.next();
            }
        }

        return row;
    }

    private int scanCol() {

        boolean isValid;
        Scanner scanner = new Scanner(System.in);
        int col = 0;

        isValid = false;
        while (!isValid) {
            System.out.print("COL (1-3): ");
            if (scanner.hasNextInt()) {
                col = scanner.nextInt();
                if (col <= 3 && col > 0) {
                    isValid = true;
                }
            } else {
                scanner.next();
            }
        }
        return col;
    }


    private boolean hasWinner() {
        // Überprüfen der Zeilen
        for (int i = 0; i < 3; i++) {
            if (board.cells[i][0] != ' ' && board.cells[i][0] == board.cells[i][1] && board.cells[i][1] == board.cells[i][2]) {
                return true;
            }
        }
        // Überprüfen der Spalten
        for (int i = 0; i < 3; i++) {
            if (board.cells[0][i] != ' ' && board.cells[0][i] == board.cells[1][i] && board.cells[1][i] == board.cells[2][i]) {
                return true;
            }
        }
        // Überprüfen der Diagonalen
        if (board.cells[0][0] != ' ' && board.cells[0][0] == board.cells[1][1] && board.cells[1][1] == board.cells[2][2]) {
            return true;
        }
        if (board.cells[0][2] != ' ' && board.cells[0][2] == board.cells[1][1] && board.cells[1][1] == board.cells[2][0]) {
            return true;
        }

        // Kein Gewinner
        return false;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        int row = 0, col = 0;

        System.out.println("TicTacToe is starting!");
        board.print();

        while (!hasWinner() && !board.isFull()) {
            System.out.println(" Current player is " + this.currentPlayer.getMarker());
            row = scanRow();
            col = scanCol();

            while (!board.isCellEmpty(row - 1, col - 1)) {
                System.out.println("Cell is not empty!");
                board.print();
                row = scanRow();
                col = scanCol();
            }

            board.place(row - 1, col - 1, currentPlayer.getMarker());
            board.print();
            switchCurrentPlay();
        }
        if(hasWinner()){
            switchCurrentPlay();
            System.out.println("Winner is : " + currentPlayer.getMarker());
        }else {
            System.out.println("No winner");
        }
        System.out.println("New game? [Y/N]");
        String input = sc.next();
        if(Objects.equals(input, "Y")){
            board.clear();
            this.start();
        }
    }
}
