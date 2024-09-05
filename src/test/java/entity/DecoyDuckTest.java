package entity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {
    private DecoyDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        d.swim();
        assertTrue(out.toString().contains("Sinks..."));
    }

    @Test
    public void fly() {
        d.fly();
        assertTrue(out.toString().contains("Fly no way"));
    }

    @Test
    public void makeSound() {
        d.makeSound();
        assertTrue(out.toString().contains("Mute..."));
    }

    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().contains("Decoy Duck"));
    }

    @Test
    public void testToString() {
        String output = d.toString();
        String expected  = "DecoyDuck{}";
        assertEquals(expected, output);
    }
}