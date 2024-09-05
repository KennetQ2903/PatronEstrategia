package strategy.sound;

import interfaces.ISoundBehavior;

public class Mute implements ISoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Mute...");
    }
}
