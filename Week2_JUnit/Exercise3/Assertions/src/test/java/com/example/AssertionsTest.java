package Week2_JUnit.Exercise3.Assertions.src.test.java.com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    

    @Test
    public void testAssertions(){
        //Arrange and Act are merged for shorter code.

        //Assert equals
        assertEquals("Sum should be 5",5,2+3);

        //Assert true
        assertTrue("5 should be greater than 3",5>3);

        //Assert False
        assertFalse("5 should not be less than 3",5<3);

        //Assert null
        Object obj1 = null;
        assertNull("Object should be null",obj1);

        //Assert not null
        Object obj2 = new Object();
        assertNotNull("Object should not be null",obj2);
    }
}
