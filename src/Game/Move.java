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

    public Board get_newBoard(Board b) {
        b.getBoard().get(this.s.getX()).get(this.s.getY()).setPiece(null);
        Cell ge = b.getCell(this.e.getY(), this.e.getX());
        ge.setPiece(origin);
        b.updateCell(ge);

        return b;

    }

    public Cell getStart() {
        return this.s;
    }

    public Cell getEnd() {
        return this.e;
    }
}
