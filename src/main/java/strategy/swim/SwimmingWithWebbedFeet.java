package strategy.swim;

import interfaces.ISwim;

public class SwimmingWithWebbedFeet implements ISwim {
    @Override
    public void swim() {
        System.out.println("Swimming with Webbed Feet");
    }
}
