package BehavioralDesignPatterns.command;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        TV tv = new TV();

        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        remoteControl.setCommand(tvOnCommand);
        remoteControl.pressButton(); // Output: TV is ON

        remoteControl.setCommand(tvOffCommand);
        remoteControl.pressButton(); // Output: TV is OFF
    }
}
