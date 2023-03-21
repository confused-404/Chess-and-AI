package Game.Pieces;

public class Piece {

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
}
