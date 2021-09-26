package musicplayer;

import exercise.MpThreePlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3Test {
    Mp3 sharp;
    @BeforeEach
    public void setUp() {
        sharp = new Mp3();
    }
    @Test
    void testMp3PlayerCanTurnOn() {
        assertFalse(sharp.isOn());
        sharp.turnOn(true);
        assertTrue(sharp.isOn());
    }
    @Test
    void testMp3PlayerCanTurnOff() {
        sharp.turnOn(true);
        assertTrue(sharp.isOn());
        sharp.turnOff(true);
        assertTrue(sharp.isOff());
    }
    @Test
    void testMp3PlayerCanPlayMusic() {
        sharp.playMusic(true);
        assertTrue(sharp.playMusic(true));
    }
}