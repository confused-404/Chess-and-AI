package Game.Pieces;

import Game.Board;
import Game.Cell;

public abstract class Piece {

    private int x;
    private int y;
    protected String name;
    protected boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public String getName() {
        return this.name;
    }

    public boolean get_isWhite() {
        return isWhite;
    }

    public abstract boolean isLegal(Board board, Cell s, Cell e);

}
