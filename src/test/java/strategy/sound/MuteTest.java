package strategy.sound;

import org.junit.Before;
import org.junit.Test;
import strategy.fly.FlyWithWings;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MuteTest {

    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void makeSound() {
        Mute mute = new Mute();
        mute.makeSound();
        assertTrue(out.toString().contains("Mute..."));
    }
}