package entity;

import strategy.fly.FlyNoWay;
import strategy.sound.Mute;
import strategy.swim.Sink;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        fb = new FlyNoWay();
        sb = new Mute();
        swb = new Sink();
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
