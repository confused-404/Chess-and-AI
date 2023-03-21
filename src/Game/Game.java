package Game;

public class Game {
    
    private Board board;

    public Game() {
        board = new Board();
        board.populateBoard();
        board.printBoard();
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
