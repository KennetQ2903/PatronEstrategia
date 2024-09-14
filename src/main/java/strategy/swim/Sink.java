package strategy.swim;

import interfaces.ISwim;

public class Sink implements ISwim {
    @Override
    public void swim() {
        System.out.println("Sinks...");
    }
}
