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

    private List<Integer> getMove(Game game) {
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

    private void loop(Game game) {
        game.board.printBoard();
        List<Integer> i = game.getMove(game);
        Cell s = null;
        Cell e = null;
        try {
            s = game.board.getCell(i.get(0), i.get(1));
            e = game.board.getCell(i.get(2), i.get(3));
        } catch (Exception ex) {
            System.out.println("Invalid input");
            loop(game);
        }
        Move move = new Move(s, e);
        game.moves.add(move);
        if (move.legal(game.board)) game.board = move.get_newBoard(game.board);
        else System.out.println("illegal move");
    }

    public static void main(String[] args) { // game loop
        Game game = new Game();
        while (true) {
            game.loop(game);
        }
    }

    
}
