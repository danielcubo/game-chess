package chess;

import boardgame.Board;
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

    private void chessPlacePiecesOnTheBoard (char column, int row, ChessPiece piece) {
        this.board.placePiece(piece, new ChessPosition(row, column).convertBoardPositionToMatrixPosition());
    }

    // Start the chess game by placing the pieces on the board
    private void initialSetup () {
        // this.board.placePiece(new Rook(this.board, Color.WHITE), new Position(2, 1));
        // this.board.placePiece(new King(this.board, Color.BLACK), new Position(0, 4));
        // this.board.placePiece(new King(this.board, Color.WHITE), new Position(7, 4));

        this.chessPlacePiecesOnTheBoard('b', 6, new Rook(board, Color.WHITE));
        this.chessPlacePiecesOnTheBoard('e', 8, new King(board, Color.BLACK));
        this.chessPlacePiecesOnTheBoard('e', 1, new King(board, Color.WHITE));
    }
}
