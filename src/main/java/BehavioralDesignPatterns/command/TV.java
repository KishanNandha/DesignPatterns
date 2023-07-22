package BehavioralDesignPatterns.command;

public class TV {
    private int volume = 0;

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume up: " + volume);
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume down: " + volume);
    }
}