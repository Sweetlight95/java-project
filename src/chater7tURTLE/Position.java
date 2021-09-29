package chater7tURTLE;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition =  rowPosition;
        this.columnPosition = columnPosition;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Position{");
        sb.append("rowPosition =").append(rowPosition);
        sb.append("columnPosition =").append(columnPosition);
        sb.append('}');
        return sb.toString();
    }
    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }
    @Override
    public boolean equals(Object anotherPosition) {
        Position comparedPosition = (Position) anotherPosition;
        if(anotherPosition == null) return false;
        if(!anotherPosition.getClass().isInstance(this)) return false;
        boolean columnsAreEqual = columnPosition == comparedPosition.columnPosition;
        boolean rowsAreEqual = rowPosition == comparedPosition.rowPosition;
        return columnsAreEqual & rowsAreEqual;
//        return this.columnPosition == comparedPosition.columnPosition && this.rowPosition == comparedPosition.rowPosition;
    }
//    @Override
//    public boolean equals(Object o) {
//        if ( this == o ) return true;
//        if ( !(o instanceof Position Position)) return false;
//        boolean rowsAreEqual = Integer.compare(rowPosition, Position.rowPosition) == 0;
//        boolean columnsAreEqual = Integer.compare(columnPosition, Position.columnPosition)==0;
//        return rowsAreEqual && columnsAreEqual;
//    }
    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}
