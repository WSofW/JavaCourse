class PlayerTic {
    String name;
    char symbol;

    public PlayerTic(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Game {
    char[][] board = new char[3][3];
    PlayerTic player1;
    PlayerTic player2;
    PlayerTic currentPlayer;

    public Game(PlayerTic p1, PlayerTic p2) {
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = p1;
    }

    public void makeMove(int row, int col) {
        if (board[row][col] == '\0') {
            board[row][col] = currentPlayer.getSymbol();
            if (checkWin()) {
                System.out.println(currentPlayer.getName() + " победил!");
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        } else {
            System.out.println("Move not allowed.");
        }
    }

    private boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        return false; // Simplified logic
    }

    public void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell == '\0' ? "-" : cell);
            }
            System.out.println();
        }
    }
}
