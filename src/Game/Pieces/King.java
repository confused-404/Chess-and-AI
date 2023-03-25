package Game.Pieces;

import Game.Board;
import Game.Cell;

public class King extends Piece {
    
    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "King";
    }

	@Override
	public boolean isLegal(Cell s, Cell e) {
		if (s.equals(e)) return false;

		if (e.hasPiece()) {
			if (e.getPiece().get_isWhite() == this.get_isWhite()) return false;
		} 
		if ((e.getY() - s.getY() <= 1 || e.getY() - s.getY() >= -1) && (e.getX() - s.getX() <= 1 || e.getX() - s.getX() >= -1)) return true;
		return false;
	}

}
