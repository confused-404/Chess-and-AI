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
        b.getBoard().get(this.s.getY()).get(this.s.getX()).setPiece(null);
        b.getCell(this.e.getX(), this.e.getY()).setPiece(this.origin);

        return b;

    }

    public boolean legal() {
        return this.origin.isLegal(this.s, this.e);
    }

    public Cell getStart() {
        return this.s;
    }

    public Cell getEnd() {
        return this.e;
    }
}
