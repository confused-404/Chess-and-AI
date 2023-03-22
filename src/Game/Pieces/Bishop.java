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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isLegal'");
	}

}
