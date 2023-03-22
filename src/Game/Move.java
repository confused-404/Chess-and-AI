package Game;

import Game.Pieces.Piece;
import java.util.List;
import java.util.ArrayList;

public class Move {
    private Cell s;
    private Cell e;
    private Piece dest;
    private Piece origin;

    Move(Cell s, Cell e) {
        this.s = s;
        this.e = e;
        this.origin = this.s.getPiece();
        this.dest = this.e.getPiece();
    }

    public Board get_newBoard() {
        Board b = new Board();
        b.populateBoard();
        b.getBoard().get(this.s.getY()).get(this.s.getX()).setPiece(null);
        List<Cell> g = b.getBoard().get(this.e.getY());
        Cell ge = g.get(this.e.getX());
        ge.setPiece(origin);
        b.updateCell(ge);

        return b;

    }
}
