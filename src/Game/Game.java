package Game;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    
    private Board board;
    private List<Move> moves;
    private Scanner scanner;

    public Game() {
        board = new Board();
        scanner = new Scanner(System.in);
        moves = new ArrayList<Move>();
        board.populateBoard();
    }

    public List<Integer> getMove() {
        System.out.println("What move do you want to make? (format: row,column to row,column)");
        String i =  scanner.nextLine();
        i = i.replace("to", "");
        int ox = Character.getNumericValue(i.charAt(0));
        int oy = Character.getNumericValue(i.charAt(2));
        int dx = Character.getNumericValue(i.charAt(5));
        int dy = Character.getNumericValue(i.charAt(7));
        List<Integer> sol = new ArrayList<Integer>();
        sol.add(ox);
        sol.add(oy);
        sol.add(dx);
        sol.add(dy);
        return sol;
    }

    public static void main(String[] args) { // game loop
        Game game = new Game();
        game.board.printBoard();
        List<Integer> moveList = game.getMove();
        Cell s = new Cell(moveList.get(0), moveList.get(1), true);
        Cell e = new Cell(moveList.get(2), moveList.get(3), true);
        Move move = new Move(s, e);
        game.moves.add(move);
        game.board = move.get_newBoard();
        game.board.printBoard();
    }

    
}
