package boardgame;

public class Board {

    // Basic Attributes
    private int       rows;
    private int       columns;
    private Piece[][] pieces;

    // Constructor with Arguments
    public Board (int rows, int columns) {
        this.rows    = rows;
        this.columns = columns;
        this.pieces  = new Piece[rows][columns];
    }

    // Getter Methods
    public int getRows    () { return this.rows;    }
    public int getColumns () { return this.columns; }

    // Setter Methods
    public void setRows    (int value) { this.rows    = value; }
    public void setColumns (int value) { this.columns = value; }

    public Piece piece (int row, int column) {
        return this.pieces[row][column];
    }

    public Piece piece (Position position) {
        return this.pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        this.pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
