package Game;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    
    private Board board;
    private List<Move> moves;
    private Scanner scanner;
    private Player[] players;

    public Game() {
        board = new Board();
        scanner = new Scanner(System.in);
        moves = new ArrayList<Move>();
        board.populateBoard();
    }

    public List<Integer> getMove(Game game) {
        game.board.printBoard();
        System.out.println("What move do you want to make? (format: column,row to column,row)");
        String i =  scanner.nextLine();
        i = i.replace("to", "");
        int ox = 0; int oy = 0; int dx = 0; int dy = 0;
        try {
            ox = Character.getNumericValue(i.charAt(0));
            oy = Character.getNumericValue(i.charAt(2));
            dx = Character.getNumericValue(i.charAt(5));
            dy = Character.getNumericValue(i.charAt(7));
        } catch (Exception e) {
            System.out.println("Invalid input");
            return getMove(game);
        }
        List<Integer> sol = new ArrayList<Integer>();
        sol.add(ox);
        sol.add(oy);
        sol.add(dx);
        sol.add(dy);
        return sol;
    }

    public static void main(String[] args) { // game loop
        Game game = new Game();
        List<Integer> moveList = game.getMove(game);
        Cell s = game.board.getCell(moveList.get(0), moveList.get(1));
        Cell e = game.board.getCell(moveList.get(2), moveList.get(3));
        Move move = new Move(s, e);
        game.moves.add(move);
        game.board = move.get_newBoard(game.board);
    }

    
}
