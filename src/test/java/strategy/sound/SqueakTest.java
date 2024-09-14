package strategy.sound;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqueakTest {
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void makeSound() {
        Squeak squeak = new Squeak();
        squeak.makeSound();
        assertTrue(out.toString().contains("Squeak!"));
    }
}