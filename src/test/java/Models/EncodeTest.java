package Models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void getLetters() {
        Encode encode = new Encode("THE", "QEB");
        assertEquals("THE", encode.getLetters());
    }

    @Test
    public void getCypherLetters() {
        Encode encode = new Encode("THE", "QEB");
        assertEquals("QEB", encode.getCypherLetters());
    }

    @Test
    public void Encode_Instantiation(){
        Encode encode = new Encode("THE", "QEB");
        assertTrue("Class is correctly instantiated", encode instanceof Encode);
    }

    @Test
    public void encoder(){
        Encode encode = new Encode("THE","QEB");
        assertEquals("QEB", encode.encoder("THE","QEB"));
    }
}