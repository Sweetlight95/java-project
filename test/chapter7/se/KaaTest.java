package chapter7.se;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaaTest {
    Kaa sevenSegmentDisplay;
    int[][] screen;
    @BeforeEach
    void setUp() {
        sevenSegmentDisplay = new Kaa();
        sevenSegmentDisplay.clear();
        screen = new int[5][4];
        screen = sevenSegmentDisplay.getScreen();
    }
    @Test
    void testCanClearScreenTest(){
        int[][] emptyScreen = new int[5][4];
        assertArrayEquals(emptyScreen, sevenSegmentDisplay.getScreen());
    }
    @Test
    void testDisplayCanWriteOnA() {
        sevenSegmentDisplay.writeOnA();
        int[][] screen = sevenSegmentDisplay.getScreen(); sevenSegmentDisplay:
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[0][i]);
        } screen:  ;
    }
    @Test
    void testDisplayCanWriteOnB() {
        sevenSegmentDisplay.writeOnB();
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    void testDisplayCanWriteOnC() {
        sevenSegmentDisplay.writeOnC();
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    void testDisplayCanWriteOnD() {
        sevenSegmentDisplay.writeOnD();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[4][i]);
        }
    }
    @Test
    void testDisplayCanWriteOnE() {
        sevenSegmentDisplay.writeOnE();
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][0]);
        }
    }
    @Test
    void testDisplayCanWriteOnF() {
        sevenSegmentDisplay.writeOnF();
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][0]);
        }
    }
    @Test
    void testDisplayCanWriteOnG() {
        sevenSegmentDisplay.writeOnG();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[2][i]);
        }
    }
    @Test
    void testDisplay() {
        sevenSegmentDisplay.writeOnA();
        sevenSegmentDisplay.writeOnB();
        sevenSegmentDisplay.writeOnC();
        sevenSegmentDisplay.writeOnD();
        sevenSegmentDisplay.writeOnE();
        sevenSegmentDisplay.writeOnF();
        sevenSegmentDisplay.writeOnG();
        sevenSegmentDisplay.dispay();
    }
    @Test
    void aTest(){
        sevenSegmentDisplay.setScreen("10000001");
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[0][i]);
        }
    }
    @Test
    void bTest(){
        sevenSegmentDisplay.setScreen("01000001");
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    void cTest(){
        sevenSegmentDisplay.setScreen("00100001");
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    void gTest(){
        sevenSegmentDisplay.setScreen("11111111");
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    void test8() {
        sevenSegmentDisplay.setScreen("11111111");
        sevenSegmentDisplay.dispay();
    }
    @Test
    void testThereCanBeOnlyEightDigit() {
        assertThrows(IllegalArgumentException.class,
                () -> sevenSegmentDisplay.setScreen("111110111"));

//        sevenSegmentDisplay.setScreen("997186309391");
    }
    @Test
    void testForOnlyBinaryDigit(){
        assertThrows(IllegalArgumentException.class, () -> sevenSegmentDisplay.setScreen("12231221"));
    }
    @Test
    void testLastBitAtZeroTurnsOffDisplay(){
        sevenSegmentDisplay.setScreen("11111110");

        for (int i = 2; i < 5; i++) {
            assertEquals(0, screen[i][3]);
        }
    }
    @Test
    void testLessThan8DigitHasTrailingZero(){
        sevenSegmentDisplay.setScreen("1111");
        for (int i = 1; i < 4; i++) {
            assertEquals(0, screen[0][1]);
        }
    }
}