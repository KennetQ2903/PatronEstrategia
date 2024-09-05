package strategy.fly;

import interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
