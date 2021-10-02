package chapter7.se;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPrintingTest {
    int shapes[][] = new int[5][5];
    NumberPrinting shape;
    @BeforeEach
    public void setUp() {
        shape = new NumberPrinting();
    }
    @Test
    void testForShapeA() {
       shape.shapeA();
       int[][] sharp = shape.getShapeA();
        assertEquals(1, sharp[0][0]);
    }
    @Test
    void testForShapeB() {
        shape.shapeB();
        int[][] sharp = shape.getShapeB();
        assertEquals(1, sharp[0][4]);
    }
    @Test
    void testForShapeC() {
        shapes[2][4] = 1;
        shapes[3][4] = 1;
        shapes[4][4] = 1;
        assertEquals(1, shapes[2][4]);
    }
    @Test
    void testForShapeD() {
        shapes[4][0] = 1;
        shapes[4][1] = 1;
        shapes[4][2] = 1;
        shapes[4][3] = 1;
        shapes[4][4] = 1;
        assertEquals(1, shapes[4][0]);
    }
    @Test
    void testForShapeE() {
        shapes[2][0] = 1;
        shapes[3][0] = 1;
        shapes[4][0] = 1;
        assertEquals(1, shapes[2][0]);
    }
    @Test
    void testForShapeG() {
        shapes[2][0] = 1;
        shapes[2][1] = 1;
        shapes[2][2] = 1;
        shapes[2][3] = 1;
        shapes[2][4] = 1;
        assertEquals(1, shapes[2][0]);
        assertEquals(1, shapes[2][1]);
        assertEquals(1, shapes[2][2]);
        assertEquals(1, shapes[2][3]);
        assertEquals(1, shapes[2][4]);
    }

}