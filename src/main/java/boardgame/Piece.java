package boardgame;

public class Piece {

    // Basic Attributes
    protected Position position;
    private   Board    board;

    // Construtor with Arguments
    public Piece (Board board) {
        this.position = null;
        this.board    = board;
    }

    // Getter Methods
    protected Board getBoard () { return this.board; }
}
