package strategy.swim;

import interfaces.ISwim;

public class Float implements ISwim {
    @Override
    public void swim() {
        System.out.println("Just float...");
    }
}
