package demogradle;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest{
    @Test
    public void testAppHasGreeting(){
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
