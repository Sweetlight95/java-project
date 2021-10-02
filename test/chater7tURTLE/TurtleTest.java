package chater7tURTLE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chater7tURTLE.Direction.*;
//import static chater7tURTLE.Direction.*;
import static chater7tURTLE.PenPosition.UP;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Pen pen;
    Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        pen = ijapa.getPen();
    }

    @Test
    void testThatTurtleHasAPen() {
        assertNotNull(pen);
    }

    @Test
    void testThatPenIsUpByDefault() {
        assertSame(UP, ijapa.getPen().getPosition());
    }

    @Test
    void testThatTurtleCanMovePenDown() {
        assertSame(UP, ijapa.getPen().getPosition());
        ijapa.penDown();
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
    }
    @Test
    void testThatTurtleCanMovePenUp() {
        ijapa.penDown();
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
        ijapa.penUp();
        assertSame(UP, ijapa.getPen().getPosition());
    }
    @Test
    @DisplayName("Turtle can turn right while facing east test")
    public void testThatTurtleCanTurnRight1() {
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing south test")
    public void testThatTurtleCanTurnRight2() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing west test")
    public void testThatTurtleCanTurnRight3() {
      ijapa.turnRight();
      ijapa.turnRight();
      assertSame(WEST, ijapa.getCurrentDirection());
      ijapa.turnRight();
      assertSame(NORTH, ijapa.getCurrentDirection());
}
    @Test
    @DisplayName("Turtle can turn right while facing north test")
    public void testThatTurtleCanTurnRight4() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }
//todo add turn right while facing north test
    @Test
    @DisplayName("Turtle can turn left while facing east test")
    public void testThatTurtleCanTurnLeft1() {
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn left while facing north test")
    public void testThatTurtleCanTurnLeft2() {
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn left while facing south test")
    public void testThatTurtleCanTurnLeft3() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn left while facing east test")
    public void testThatTurtleCanTurnLeft4() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanMoveForwardWhileFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanMoveForwardWhileFacingSouth() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanMoveForwardWhileFacingWest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanMoveForwardWhileFacingNorth() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }
    @Test
    void testTurtleCanWriteOnSketchpadWhileFacingEast() {
        ijapa.penDown();
        assertSame(EAST, ijapa.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 3);
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, sketchPad.getFloor()[0][3]);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        sketchPad.displayFloor();
        }
    @Test
    void testTurtleCanWriteOnSketchpadWhileFacingSouth() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        ijapa.writeOn(sketchPad, 3);
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(new Position(2, 2), ijapa.getCurrentPosition());
        sketchPad.displayFloor();
    }
    @Test
    void testTurtleCanWriteOnSketchpadWhileFacingWest() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        assertEquals(new Position(2, 2), ijapa.getCurrentPosition());
        ijapa.writeOn(sketchPad, 3);
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[2][2]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][0]);
        assertEquals(new Position(2, 4), ijapa.getCurrentPosition());
        sketchPad.displayFloor();
 }
    @Test
    void testTurtleCanWriteOnSketchpadWhileFacingNorth() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        ijapa.writeOn(sketchPad, 3);
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[0][0]);
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        sketchPad.displayFloor();
    }
}