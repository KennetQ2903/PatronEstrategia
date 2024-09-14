package entity;

import interfaces.IFly;
import interfaces.ISound;
import interfaces.ISwim;

public abstract class Duck {
    public Duck() {
    }

    // Actions
    protected IFly fb;
    protected ISound sb;
    protected ISwim swb;

    public abstract void display();

    public void swim() {
        swb.swim();
    }


    public void fly() {
        fb.fly();
    }

    public void makeSound() {
        sb.makeSound();
    }

    public void setFlybehavior(IFly fb) {
        this.fb = fb;
    }

    public void setSoundBehavior(ISound sb) {
        this.sb = sb;
    }
    public void setSwimBehavior(ISwim swb) {
        this.swb = swb;
    }


    @Override
    public String toString() {
        return "Duck{}";
    }
}
