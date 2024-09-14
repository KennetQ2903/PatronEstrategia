package entity;

import strategy.fly.FlyNoWay;
import strategy.sound.Mute;
import strategy.swim.Sink;

public class ModelDuck extends Duck {
    public ModelDuck() {
        //Default config
        fb = new FlyNoWay();
        swb = new Sink();
        sb = new Mute();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }
}
