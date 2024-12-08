package boardgame;

public class Position {

    // Basic Attributes
    private int row;
    private int column;

    // Constructor with Arguments
    public Position (int row, int column) {
        this.row    = row;
        this.column = column;
    }

    // Getter Methods
    public int getRow    () { return this.row;    }
    public int getColumn () { return this.column; }

    // Setter Methods
    public void setRow    (int value) { this.row = value;    }
    public void setColumn (int value) { this.column = value; }

    @Override
    public String toString() {
        return this.row+", "+this.column;
    }
}