public class SudokuSolver {
    public int matrix [][];

    
    SudokuSolver(int matrix [][]) {
        this.matrix = matrix;

    }

    private boolean checkRow(int Number, int Row) {
        for (int i = 0; i < this.matrix.length; i++) {
            if (Number == this.matrix[Row][i])
                return false;
        }
        return true;
    }

    private boolean checkColumn(int Number,int Column) {
        for (int i = 0; i < this.matrix.length; i++){
            if (Number == this.matrix[i][Column])
                return false;
        }
        return true;
    }

    private boolean checkSquare(int Number, int X, int Y) {
        CellCoordinates cell = new CellCoordinates(X, Y);
        CellCoordinates squareLeftCorner = cell.mySquare();

        for (int i = squareLeftCorner.Row; i < squareLeftCorner.Row + 3; i++) {
            for (int j = squareLeftCorner.Column; j < squareLeftCorner.Column + 3; j++) {
                if (Number == this.matrix[i][j])
                    return false;
            }
        }
        return true;
    }
    
    private void fillCell(int cellRow, int cellColumn) {

    }


    private void fillCells() {
        for(int i = 0; i < this.matrix.length; i++) {
            for(int j = 0; j < this.matrix[i].length; j++) {
                if (this.matrix[i][j] == 0) {
                    fillCell(i, j);
                }
            }
        }
    }

    public void generate() {
        fillCells();
    }

    public void print() {
        generate();
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
