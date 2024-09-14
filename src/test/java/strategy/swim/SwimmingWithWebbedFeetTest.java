package strategy.swim;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SwimmingWithWebbedFeetTest {
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        SwimmingWithWebbedFeet swimmingWithWebbedFeetTest = new SwimmingWithWebbedFeet();
        swimmingWithWebbedFeetTest.swim();
        assertTrue(out.toString().contains("Swimming with Webbed Feet"));
    }
}