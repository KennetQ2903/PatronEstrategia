package strategy.sound;

import interfaces.ISound;

public class Mute implements ISound {
    @Override
    public void makeSound() {
        System.out.println("Mute...");
    }
}
