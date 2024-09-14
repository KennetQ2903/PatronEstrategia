package strategy.fly;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {

    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        FlyWithWings flyWithWings = new FlyWithWings();
        flyWithWings.fly();
        assertTrue(out.toString().contains("Fly with wings"));
    }
}