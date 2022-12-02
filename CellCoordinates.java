public class CellCoordinates {
    public int Row;
    public int Column;

    public CellCoordinates(int Row, int Column) {
        this.Row = Row;
        this.Column = Column;
    }

    public CellCoordinates mySquare() {
        int cornerColumn = 0;
        int cornerRow = 0;

        if (this.Column / 3 == 0) {
            cornerColumn = 0;
        } else if (this.Column / 3 == 1) {
            cornerColumn = 3;
        } else if (this.Column / 3 == 2) {
            cornerColumn = 6;
        }

        if (this.Row / 3 == 0) {
            cornerRow = 0;
        } else if (this.Row / 3 == 1) {
            cornerRow = 3;
        } else if (this.Row / 3 == 2) {
            cornerRow = 6;
        }

        return new CellCoordinates(cornerRow, cornerColumn);
    }
}
