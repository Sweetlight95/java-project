package musicplayer;

import exercise.MpThreePlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3Test {
    @Test
    void testMp3PlayerCanTurnOn() {
        Mp3Test sharp = new Mp3Test();
        assertFalse(sharp.isOn());

        sharp.turnOn();
        assertTrue(isOn());
    }

}