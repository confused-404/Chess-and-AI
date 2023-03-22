package Game.Pieces;

import Game.Board;
import Game.Cell;

public class King extends Piece {
    
    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "King";
    }

	@Override
	public boolean isLegal(Board board, Cell s, Cell e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isLegal'");
	}

}
