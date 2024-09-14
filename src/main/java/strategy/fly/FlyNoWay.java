package strategy.fly;

import interfaces.IFly;

public class FlyNoWay implements IFly {
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
