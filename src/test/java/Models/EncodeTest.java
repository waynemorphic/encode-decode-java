package Models;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class EncodeTest {

    /*
    * - JUnit runs by creating an instance before each test case runs
    * - therefore, we can use BeforeEach annotation to create an initializer method that runs before every method
    * - an AfterEach annotation can be used as a tear down, to clean up the code after every method runs
    * -an AfterAll annotation can be added as a cleaner after all methods run instead of individual test cases run
    * */

    Encode encode = new Encode("THE RED FOX", 2);

//    @Test
//    @BeforeEach
//    public void InitInstance() {
//        encode = new Encode("THE RED FOX", 2);
//    }

    @Test
    @AfterAll
    public void tearDown(){
        System.out.println("Tear down method to clean up after each test method runs");
    }


    @Test
    @DisplayName("Test case for checking if value has been stored")
    public void getLetters() {
        assertEquals("THE RED FOX", encode.getLetters());
    }

    @Test
    @DisplayName("Test case to check if an integer has been supplied")
    public void getShiftKey() {
        assertEquals(2, encode.getShiftKey());
    }

    @Test
    @DisplayName("Test case to ascertain that the class is correctly instanced")
    public void Encode_Instantiation(){
        assertTrue("Class is correctly instantiated", encode instanceof Encode);
    }

    @Test
    @DisplayName("We are shifting input by shiftKey value and outputting an encrypted message")
    public void encoder(){
        assertEquals("jk", encode.encrypt("HI",2));
    }
}