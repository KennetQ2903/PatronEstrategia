package entity;

import interfaces.IFlyBehavior;
import interfaces.ISoundBehavior;
import interfaces.ISwimBehavior;

public abstract class Duck {
    public Duck() {
    }

    // Actions
    protected IFlyBehavior fb;
    protected ISoundBehavior sb;
    protected ISwimBehavior swb;

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


    @Override
    public String toString() {
        return "Duck{}";
    }
}
