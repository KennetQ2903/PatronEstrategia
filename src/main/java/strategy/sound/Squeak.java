package strategy.sound;

import interfaces.ISoundBehavior;

public class Squeak implements ISoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }
}
