package Game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    
    List<List<Cell>> board;

    public Board() {
        board = new ArrayList<List<Cell>>();
    }
    
    public void populateBoard() {

        for (int i = 0; i < 8; i++) {
            board.add(new ArrayList<Cell>());
            for (int j = 0; j < 8; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
