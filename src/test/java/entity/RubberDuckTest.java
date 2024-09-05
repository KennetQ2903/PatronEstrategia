package entity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest {
    private RubberDuck rB;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        rB = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        rB.swim();
        assertTrue(out.toString().contains("Just float..."));
    }

    @Test
    public void fly() {
        rB.fly();
        assertTrue(out.toString().contains("Fly no way"));
    }

    @Test
    public void makeSound() {
        rB.makeSound();
        assertTrue(out.toString().contains("Squeak!"));
    }

    @Test
    public void testDisplay(){
        rB.display();
        assertTrue(out.toString().contains("Rubber Duck"));
    }

    @Test
    public void testToString() {
        String output = rB.toString();
        String expected  = "RubberDuck{}";
        assertEquals(expected, output);
    }
}