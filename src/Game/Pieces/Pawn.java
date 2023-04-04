package Game.Pieces;

import Game.Board;
import Game.Cell;

public class Pawn extends Piece {
    
    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "Pawn";
    }

	@Override
	public boolean isLegal(Board board, Cell s, Cell e) {
        // METHOD FINISHED
        if (s.equals(e)) return false;

        if (e.getX() > 7 || e.getX() < 0 || s.getX() > 7 || s.getX() < 0) return false;

		if (s.getPiece().get_isWhite()) { // origin piece is white
            if (s.getY() == 6) { // pawn is on starting line
                // legal moves include going forward once and twice
                if (e.getY() - s.getY() >= -2 && s.getX() == e.getX() && !e.hasPiece()) {
                    return true;
                }
            }
            if (e.getY() - s.getY() == 1 && e.getX() == s.getX() && !e.hasPiece()) { // moving one time forward
                return true;
            }
            if (e.hasPiece() && s.getY() - e.getY() == 1 && (Math.abs(e.getX() - s.getX()) == 1)) {
                if (!e.getPiece().get_isWhite()) return true;
            }
        } else { // origin piece is black
            if (s.getY() == 1) { // pawn is on starting line
                // legal moves include going forward once and twice
                if (e.getY() - s.getY() <= 2 && s.getX() == e.getX() && !e.hasPiece()) {
                    return true;
                }
            }
            if (e.getY() - s.getY() == -1 && e.getX() == s.getX() && !e.hasPiece()) { // moving one time forward
                return true;
            }
            if (e.hasPiece() && s.getY() - e.getY() == -1 && (Math.abs(e.getX() - s.getX()) == 1)) {
                if (e.getPiece().get_isWhite()) return true;
            }

        }
        return false;
	}

}
