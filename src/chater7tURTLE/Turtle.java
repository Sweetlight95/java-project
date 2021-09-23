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
        if (currentDirection == NORTH) changeCurrentDirectionTo (EAST);
       else if (currentDirection == WEST) changeCurrentDirectionTo (NORTH);
       else if (currentDirection == SOUTH) changeCurrentDirectionTo (WEST);
       else if (currentDirection == EAST) changeCurrentDirectionTo (SOUTH);
    }
    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == SOUTH) changeCurrentDirectionTo (EAST);
        else if (currentDirection == WEST) changeCurrentDirectionTo (SOUTH);
        else if (currentDirection == NORTH) changeCurrentDirectionTo (WEST);
        else if (currentDirection == EAST) changeCurrentDirectionTo (NORTH);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
