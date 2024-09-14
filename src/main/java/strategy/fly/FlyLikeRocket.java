package strategy.fly;

import interfaces.IFly;

public class FlyLikeRocket implements IFly {
    @Override
    public void fly() {
        System.out.println("I am flying like a rocket...BOOOM!");
    }
}
