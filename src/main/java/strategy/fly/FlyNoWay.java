package strategy.fly;

import interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
