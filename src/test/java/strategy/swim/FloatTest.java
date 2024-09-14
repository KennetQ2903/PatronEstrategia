package strategy.swim;

import org.junit.Before;
import org.junit.Test;
import strategy.sound.Quack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FloatTest {
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        Float floatB = new Float();
        floatB.swim();
        assertTrue(out.toString().contains("Just float..."));
    }
}