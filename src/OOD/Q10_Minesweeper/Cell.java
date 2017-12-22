package OOD.Q10_Minesweeper;

/*
* Cell is a POJO for holding the information regarding the Cell.
*
* */
public class Cell {
    private int row;
    private int column;
    private int neighborBombs;
    private boolean isBomb;
    private boolean isFlaged;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getNeighborBombs() {
        return neighborBombs;
    }

    public void setNeighborBombs(int neighborBombs) {
        this.neighborBombs = neighborBombs;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public boolean isFlaged() {
        return isFlaged;
    }

    public void setFlaged(boolean flaged) {
        isFlaged = flaged;
    }
}
