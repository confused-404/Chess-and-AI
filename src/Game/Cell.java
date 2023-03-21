package Game;

public class Cell {
    
    private Piece piece;
    private int x;
    private int y;

    public Cell(Integer x, Integer y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        if (this.piece != null) return this.piece.getName();
        else return ".";
    }

}
