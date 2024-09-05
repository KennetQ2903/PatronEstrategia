package entity;

import strategy.fly.FlyNoWay;
import strategy.sound.Squeak;
import strategy.swim.Float;

public class RubberDuck extends Duck{
    public RubberDuck() {
        fb = new FlyNoWay();
        sb = new Squeak();
        swb = new Float();
    }
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
