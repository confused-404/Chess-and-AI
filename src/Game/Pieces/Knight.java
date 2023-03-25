package Game.Pieces;

import Game.Board;
import Game.Cell;

public class Knight extends Piece {
    
    public Knight(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "knight";
    }

	@Override
	public boolean isLegal(Cell s, Cell e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isLegal'");
	}

}
