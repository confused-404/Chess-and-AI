package Game.Pieces;

import Game.Board;
import Game.Cell;

public class Rook extends Piece {
    
    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        this.name = "Rook";
    }

	@Override
	public boolean isLegal(Cell s, Cell e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isLegal'");
	}

}
