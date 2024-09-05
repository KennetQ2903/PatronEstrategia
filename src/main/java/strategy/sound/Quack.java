package strategy.sound;

import interfaces.ISoundBehavior;

public class Quack implements ISoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }
}
