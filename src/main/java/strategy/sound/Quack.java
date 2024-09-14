package strategy.sound;

import interfaces.ISound;

public class Quack implements ISound {
    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }
}
