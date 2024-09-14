package entity;

import org.junit.Before;
import org.junit.Test;
import strategy.fly.FlyLikeRocket;
import strategy.sound.Squeak;
import strategy.swim.Float;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {
    private ModelDuck modelDuck;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        modelDuck = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testModelDuckDefaultConfig() {
        modelDuck.fly();
        assertTrue(out.toString().contains("Fly no way"));
        modelDuck.swim();
        assertTrue(out.toString().contains("Sinks..."));
        modelDuck.makeSound();
        assertTrue(out.toString().contains("Mute..."));
    }

    @Test
    public void testModelDuckConfiguration(){
        modelDuck.fly();
        assertTrue(out.toString().contains("Fly no way"));
        modelDuck.setFlybehavior(new FlyLikeRocket());
        modelDuck.fly();
        assertTrue(out.toString().contains("I am flying like a rocket...BOOOM!"));
        modelDuck.setSoundBehavior(new Squeak());
        modelDuck.makeSound();
        assertTrue(out.toString().contains("Squeak!"));
        modelDuck.setSwimBehavior(new Float());
        modelDuck.swim();
        assertTrue(out.toString().contains("Just float..."));
    }

    @Test
    public void display() {
        modelDuck.display();
        assertTrue(out.toString().contains("ModelDuck"));
    }

    @Test
    public void testToString() {
        String output = modelDuck.toString();
        String expected  = "ModelDuck{}";
        assertEquals(expected, output);
    }
}