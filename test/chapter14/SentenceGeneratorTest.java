package chapter14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void createSentences(){
        for (int i = 0; i < 20; i++) {
        String sentence = SentenceGenerator.createSentence();
        assertFalse(sentence.isEmpty());
        System.out.println(sentence);
        }
    }
}