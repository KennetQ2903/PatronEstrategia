package entity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedHeadDuckTest {
    private RedHeadDuck redHeadDuck;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        redHeadDuck = new RedHeadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        redHeadDuck.swim();
        assertTrue(out.toString().contains("Swimming with Webbed Feet"));
    }

    @Test
    public void fly() {
        redHeadDuck.fly();
        assertTrue(out.toString().contains("Fly with wings"));
    }

    @Test
    public void makeSound() {
        redHeadDuck.makeSound();
        assertTrue(out.toString().contains("Quack!"));
    }

    @Test
    public void testDisplay(){
        redHeadDuck.display();
        assertTrue(out.toString().contains("RedHead Duck"));
    }

    @Test
    public void testToString() {
        String output = redHeadDuck.toString();
        String expected  = "RedHeadDuck{}";
        assertEquals(expected, output);
    }
}