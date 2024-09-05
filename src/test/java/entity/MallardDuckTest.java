package entity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {
    private MallardDuck mD;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        mD = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void swim() {
        mD.swim();
        assertTrue(out.toString().contains("Swimming with Webbed Feet"));
    }

    @Test
    public void fly() {
        mD.fly();
        assertTrue(out.toString().contains("Fly with wings"));
    }

    @Test
    public void makeSound() {
        mD.makeSound();
        assertTrue(out.toString().contains("Quack!"));
    }

    @Test
    public void testDisplay(){
        mD.display();
        assertTrue(out.toString().contains("Mallard Duck"));
    }

    @Test
    public void testToString() {
        String output = mD.toString();
        String expected  = "MallardDuck{}";
        assertEquals(expected, output);
    }
}