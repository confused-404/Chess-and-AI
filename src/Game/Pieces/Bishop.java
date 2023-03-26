package Game.Pieces;

import Game.Board;
import Game.Cell;

public class Bishop extends Piece {
    
    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "Bishop";
    }

	@Override
	public boolean isLegal(Board board, Cell s, Cell e) {
		// METHOD FINISHED
		int dx = Math.abs(e.getX() - s.getX());
		int dy = Math.abs(e.getY() - s.getY());

		if (s.equals(e)) return false;
		
		if (e.getX() > s.getX()) { // dest square is to the right of source square
			if (e.getY() > s.getY()) { // dest square is to the top right of source square
				for (int i = 1; i < dx; i++) {
					if (board.getCell(s.getX() + i, s.getY() + i).hasPiece()) return false;
				}
			} else { // dest square is to the bottom right of source square
				for (int i = 1; i < dx; i++) {
					if (board.getCell(s.getX() + i, s.getY() - i).hasPiece()) return false;
				}
			}
		}
		if (e.getX() < s.getX()) { // dest square is to the left of source square
			if (e.getY() > s.getY()) { // dest square is to the top left of source square
				for (int i = 1; i < dx; i++) {
					if (board.getCell(s.getX() - i, s.getY() + i).hasPiece()) return false;
				}
			} else { // dest square is to the bottom left of source square
				for (int i = 1; i < dx; i++) {
					if (board.getCell(s.getX() - i, s.getY() - i).hasPiece()) return false;
				}
			}
		}

		if (e.hasPiece()) {
			if (e.getPiece().get_isWhite() == this.get_isWhite()) return false;
		}
		if (dx == dy && dx > 0) return true;
		return false;
	}

}
