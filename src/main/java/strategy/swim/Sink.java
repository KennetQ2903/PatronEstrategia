package strategy.swim;

import interfaces.ISwimBehavior;

public class Sink implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("Sinks...");
    }
}
