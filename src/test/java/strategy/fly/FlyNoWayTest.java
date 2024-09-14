package strategy.fly;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNoWayTest {

    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        FlyNoWay flyNoWay = new FlyNoWay();
        flyNoWay.fly();
        assertTrue(out.toString().contains("Fly no way!"));
    }
}