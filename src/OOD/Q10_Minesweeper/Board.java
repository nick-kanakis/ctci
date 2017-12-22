package OOD.Q10_Minesweeper;
/*
* Board object manages the main functionalities of the game.
* It initializes the board with bombs and numbers in Cell objects, it also handles the flip of a cell and the actions after that
* such as:
*   1) Checks if the Cell is bomb.
*   2) Flips neighbor cells that are empty.
*   3) Updates the number of exposedCells.
*   4) Checks if the game is finished and returns the result to the Game object
*
* */
public class Board {
    private int rows;
    private int columns;
    private int numOfbombs;
    private int exposedCells;
    private Cell[][] board;
    private Cell[] bombs;

    public Board(int rows, int columns, int numOfbombs) {
        this.rows = rows;
        this.columns = columns;
        this.numOfbombs = numOfbombs;
        board = new Cell[rows][columns];
        initializeBoard();
    }

    private void initializeBoard() {
        //Initialize bombs, place them randomly on the grid and set the correct number of neighbor bombs in all the cells.
    }

    public Result flipCell(int row, int column){
        /*
        * Check if the cell is bomb, if not flip the cell and also if the numOfNeighbor bombs is 0 flip
        * all black neighbor cells
        * */
        return null;
    }

    public int getNumOfbombs() {
        return numOfbombs;
    }

    public int getExposedCells() {
        return exposedCells;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Cell[] getBombs() {
        return bombs;
    }

    public class Result {
        private boolean successful;
        private boolean finishedGame;

        public Result(boolean successful, boolean finishedGame) {
            this.successful = successful;
            this.finishedGame = finishedGame;
        }

        public boolean isSuccessful() {
            return successful;
        }

        public void setSuccessful(boolean successful) {
            this.successful = successful;
        }

        public boolean isFinishedGame() {
            return finishedGame;
        }

        public void setFinishedGame(boolean finishedGame) {
            this.finishedGame = finishedGame;
        }
    }


}
