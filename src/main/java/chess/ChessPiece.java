package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
    
    // Basic Attributes
    private Color color;

    // Constructor with Arguments
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // Getter Methods
    public Color getColor () { return this.color; }
    
}
