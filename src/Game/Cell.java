package Game;

import Game.Pieces.Piece;

public class Cell {
    
    private Piece piece;
    private int x;
    private int y;
    private boolean isWhite;

    public Cell(Integer x, Integer y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public boolean hasPiece() {
        if (this.piece != null) return true;
        return false;
    }

    @Override
    public String toString() {
        if (this.piece != null) return String.valueOf(this.piece.getName().charAt(0));
        else {
            if (this.isWhite) return "o";
            else return "+";
        }
    }

}
