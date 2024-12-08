package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    
    // Basic Attributes
    private Board board;

    // Default Constructor
    public ChessMatch () {
        this.board = new Board(8, 8);
        this.initialSetup();
    }

    // Method
    public ChessPiece[][] getPieces () {
        ChessPiece[][] matAux = new ChessPiece[this.board.getRows()][this.board.getColumns()];
        for(int i=0; i<this.board.getRows(); i++) {
            for(int j=0; j<this.board.getColumns(); j++) {
                matAux[i][j] = (ChessPiece) this.board.piece(i, j);
            }
        }
        return matAux;
    }

    // Start the chess game by placing the pieces on the board
    private void initialSetup () {
        this.board.placePiece(new Rook(this.board, Color.WHITE), new Position(2, 1));
        this.board.placePiece(new King(this.board, Color.BLACK), new Position(0, 4));
        this.board.placePiece(new King(this.board, Color.WHITE), new Position(7, 4));
    }
}
