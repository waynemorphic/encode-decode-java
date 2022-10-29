package Models;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class DecodeTest {
    Decode decode = new Decode("lqjp",2);

    @DisplayName("Test case for getter method for letters")
    @Test
    public void getLetters() {
        assertEquals("lqjp", decode.getLetters());
    }

    @Test
    @DisplayName("Test case for setter method for letters")
    public void setLetters() {
    }

    @Test
    @DisplayName("Test case for getter method for shiftKey")
    public void getShiftKey() {
        assertEquals(2,decode.getShiftKey());
    }

    @Test
    @DisplayName("Test case for setter method for shiftKey")
    public void setShiftKey() {
    }

    @Test
    @DisplayName("Test case for decrypt method. Should return a decoded text of an encoded input")
    public void decrypt() {
        assertEquals("john", decode.decrypt("lqjp", 2));
    }
}