package app;

import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        TUI.printBoard(chessMatch.getPieces());
    }
}