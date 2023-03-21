package Game.Pieces;

import Game.Board;
import Game.Cell;

public abstract class Piece { // base class for all pieces
  
    private boolean dead = false;
    private boolean white = false;
  
    public Piece(boolean white)
    {
        this.setWhite(white);
    }
  
    public boolean isWhite()
    {
        return this.white;
    }
  
    public void setWhite(boolean white)
    {
        this.white = white;
    }
  
    public boolean isDead()
    {
        return this.dead;
    }
  
    public void setKilled(boolean dead)
    {
        this.dead = dead;
    }
  
    public abstract boolean canMove(Board board, 
                                 Cell start, Cell end);
}