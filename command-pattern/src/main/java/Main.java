import command.Command;
import command.TurnOnAcCommand;
import invoker.RemoteControl;
import receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        RemoteControl acRemote = new RemoteControl();
        Command turnOnCommand = new TurnOnAcCommand(airConditioner);
        acRemote.setCommand(turnOnCommand);

        acRemote.pressButton();
        acRemote.undo();
    }
}
