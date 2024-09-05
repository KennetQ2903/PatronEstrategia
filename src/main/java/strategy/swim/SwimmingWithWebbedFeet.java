package strategy.swim;

import interfaces.ISwimBehavior;

public class SwimmingWithWebbedFeet implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("Swimming with Webbed Feet");
    }
}
