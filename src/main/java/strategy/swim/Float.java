package strategy.swim;

import interfaces.ISwimBehavior;

public class Float implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("Just float...");
    }
}
