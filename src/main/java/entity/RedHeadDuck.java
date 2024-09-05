package entity;

import strategy.fly.FlyWithWings;
import strategy.sound.Quack;
import strategy.swim.SwimmingWithWebbedFeet;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
        swb = new SwimmingWithWebbedFeet();
    }

    @Override
    public void display() {
        System.out.println("RedHead Duck");
    }

    @Override
    public String toString() {
        return "RedHeadDuck{}";
    }
}
