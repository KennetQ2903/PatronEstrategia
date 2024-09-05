package entity;

import strategy.fly.FlyWithWings;
import strategy.sound.Quack;
import strategy.swim.SwimmingWithWebbedFeet;

public class MallardDuck extends Duck {
    public MallardDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
        swb = new SwimmingWithWebbedFeet();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

    @Override
    public String toString() {
        return "MallardDuck{}";
    }
}
