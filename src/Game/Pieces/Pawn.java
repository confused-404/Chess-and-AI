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
		// check if end cell is already occupied
        if (e.hasPiece()) {
            if (e.getPiece().get_isWhite() == s.getPiece().get_isWhite()) return false; // same color, illegal
            // different colors, but occupied
            // implement check and checkmate
            return true;
        }
        return true;
	}

}
