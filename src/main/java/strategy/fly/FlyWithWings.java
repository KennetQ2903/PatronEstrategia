package strategy.fly;

import interfaces.IFly;

public class FlyWithWings implements IFly {
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
