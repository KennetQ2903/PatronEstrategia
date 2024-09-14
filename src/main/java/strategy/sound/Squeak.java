package strategy.sound;

import interfaces.ISound;

public class Squeak implements ISound {
    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }
}
