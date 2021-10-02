package chater7tURTLE;

import static chater7tURTLE.Direction.*;
import static chater7tURTLE.PenPosition.DOWN;
import static chater7tURTLE.PenPosition.UP;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPositionTo(DOWN);
    }

    public void penUp() {
        pen.setPositionTo(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == NORTH) changeCurrentDirectionTo(EAST);
        else if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);
        else if (currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
        else if (currentDirection == EAST) changeCurrentDirectionTo(SOUTH);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == SOUTH) changeCurrentDirectionTo(EAST);
        else if (currentDirection == WEST) changeCurrentDirectionTo(SOUTH);
        else if (currentDirection == NORTH) changeCurrentDirectionTo(WEST);
        else if (currentDirection == EAST) changeCurrentDirectionTo(NORTH);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == EAST) {
//             increaseColumnPositionBy(numberOfSteps);{
//             int currentColumnPosition = currentPosition.getColumnPosition();
//             currentPosition.setColumnPosition(currentColumnPosition + numberOfSteps);
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps - 1);
        }
        if (currentDirection == SOUTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps - 1);
        }
        if (currentDirection == WEST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps-1);
        }
        if (currentDirection == NORTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        }
    }

    private void increaseColumnPositionBy(int numberOfSteps) {
        currentPosition.increaseColumnPositionBy(numberOfSteps);
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        int rowPosition = currentPosition.getRowPosition();
        int columnPosition = currentPosition.getColumnPosition();
        int[][] floor = sketchPad.getFloor();
        if (this.pen.getPosition() == PenPosition.DOWN) {
            if (this.currentDirection == EAST) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition + i] = 1;
                }
            }
                if (this.currentDirection == SOUTH) {
                    for (int i = 0; i < numberOfSteps; i++) {
                        floor[rowPosition + i][columnPosition] = 1;
                    }
                }
                    if (this.currentDirection == WEST) {
                        for (int i = 0; i < numberOfSteps; i++) {
                            floor[rowPosition][columnPosition - i] = 1;
                        }
                    }
                    moveForward(numberOfSteps);
                }
            }
        }