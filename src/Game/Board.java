package Game;

import Game.Pieces.*;

public class Board {
    Cell[][] board;;
  
    public Board()
    {
        this.resetBoard();
    }
  
    public Cell getBox(int x, int y) throws Exception
    {
  
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
  
        return board[x][y];
    }
  
    public void resetBoard()
    {
        // initialize white pieces
        board[0][0] = new Cell(0, 0, new Rook(true));
        board[0][1] = new Cell(0, 1, new Knight(true));
        board[0][2] = new Cell(0, 2, new Bishop(true));
        //...
        board[1][0] = new Cell(1, 0, new Pawn(true));
        board[1][1] = new Cell(1, 1, new Pawn(true));
        //...
  
        // initialize black pieces
        board[7][0] = new Cell(7, 0, new Rook(false));
        board[7][1] = new Cell(7, 1, new Knight(false));
        board[7][2] = new Cell(7, 2, new Bishop(false));
        //...
        board[6][0] = new Cell(6, 0, new Pawn(false));
        board[6][1] = new Cell(6, 1, new Pawn(false));
        //...
  
        // initialize remaining board without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Cell(i, j, null);
            }
        }
    }
}
