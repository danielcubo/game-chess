package chess;

import boardgame.Position;

public class ChessPosition {

    // Basic Attributes
    private int  row;
    private char column;

    // Constructor with Arguments
    public ChessPosition (int row, char column) {
        if(row < 1 || row > 8 || column < 'a' || column > 'h') throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        this.row    = row;
        this.column = column;
    }

    // Getter Methods
    public int  getRow    () { return this.row;    }
    public char getColumn () { return this.column; }

    // Setter Methods
    public void setRow    (int  value) { this.row    = value; }
    public void setColumn (char value) { this.column = value; }

    protected Position convertBoardPositionToMatrixPosition () {
        // achar a linha e a coluna da matriz
        // board a1 = matriz [7][0] => matrix_row = 8 - chess_row, matrix_column = chess_column - 'a'
        // board a7 = matriz [1][0]
        // board a8 = matriz [0][0]
        return new Position(8 - this.row, this.column - 'a');
    }

    protected static ChessPosition convertMatrixPositionToBoardPosition (Position position) {
        // achar a linha e a coluna do tabuleiro
        // 
        return new ChessPosition(8-position.getRow(), (char)('a' - position.getColumn()));
    }

    @Override
    public String toString() {
        return ""+this.column+this.row;
    }
}
