package Game;

import java.util.ArrayList;
import java.util.List;
import Game.Pieces.*;

public class Board {
    
    private List<List<Cell>> board;

    public Board() {
        board = new ArrayList<List<Cell>>();
    }
    
    public void populateBoard() {

        for (int i = 0; i < 8; i++) {
            board.add(new ArrayList<Cell>());
            for (int j = 0; j < 8; j++) {
                Cell cell = new Cell(i, j, (i + j) % 2 == 0);
                if (i == 1 || i == 6) {
                    cell.setPiece(new Pawn(i, j, i == 1));
                } else if (i == 0 || i == 7) {
                    if (j == 0 || j == 7) {
                        cell.setPiece(new Rook(i, j, i == 0));
                    } else if (j == 1 || j == 6) {
                        cell.setPiece(new Knight(i, j, i == 0));
                    } else if (j == 2 || j == 5) {
                        cell.setPiece(new Bishop(i, j, i == 0));
                    } else if (j == 3) {
                        cell.setPiece(new Queen(i, j, i == 0));
                    } else if (j == 4) {
                        cell.setPiece(new King(i, j, i == 0));
                    }
                }
                board.get(i).add(cell);
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

    public Cell getCell(int x, int y) {
        return board.get(y).get(x);
    }

    public List<List<Cell>> getBoard() {
        return this.board;
    }

    public void updateCell(Cell c) {
        this.board.get(c.getY()).get(c.getX()).setPiece(c.getPiece());
    }

}
