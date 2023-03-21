package Game;

import Game.Pieces.Piece;

public class Cell {
    private int x;
    private int y;
    private Piece piece;

    public Cell(int x, int y, Piece piece) {
        sX(x);
        sY(y);
        sP(piece);
    }

    public int gX() { // gets x coordinate
        return this.x;
    }

    public int gY() { // gets y coordinate
        return this.y;
    }

    public Piece gP() { // gets piece
        return this.piece;
    }

    public void sX(int x) { // sets x coordinate
        this.x = x;
    }

    public void sY(int y) { // sets y coordinate
        this.y = y;
    }

    public void sP(Piece piece) { // sets piece
        this.piece = piece;
    }
}
