package Game.Pieces;

import Game.Board;
import Game.Cell;

public class Rook extends Piece {
    
    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "Rook";
    }

	@Override
	public boolean isLegal(Board board, Cell s, Cell e) {
		// METHOD FINISHED
		if (s.equals(e)) return false; // same cell
		if (e.getX() > 7 || e.getX() < 0 || s.getX() > 7 || s.getX() < 0) return false;

		if (e.hasPiece()) {
			if (e.getPiece().get_isWhite() == s.getPiece().get_isWhite()) return false; // friendly fire
		}
		if (s.getX() == e.getX()) { // horizontal move
			if (e.getX() > s.getX()) { // move up
				for (int i = s.getX() + 1; i < e.getX(); i++) { // loop through pieces between starting piece and ending piece
					if (board.getCell(i, s.getY()).hasPiece()) return false;
				}
			} else { // move down 
				for (int i = s.getX() - 1; i > e.getX(); i--) { // loop through pieces between starting piece and ending piece
					if (board.getCell(i, s.getY()).hasPiece()) return false;
				}
			}
		} else if (s.getY() == e.getY()) { // vertical move
			if (e.getY() > s.getY()) { // move up
				for (int i = s.getY() + 1; i < e.getY(); i++) { // loop through pieces between starting piece and ending piece
					if (board.getCell(s.getX(), i).hasPiece()) return false;
				}
			} else { // move down 
				for (int i = s.getY() - 1; i > e.getY(); i--) { // loop through pieces between starting piece and ending piece
					if (board.getCell(s.getX(), i).hasPiece()) return false;
				}
			}
		} else { // not straight line move 
			return false;
		}
		return true;
	}

}
