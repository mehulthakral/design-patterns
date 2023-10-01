package command;

import receiver.AirConditioner;

public class TurnOffAcCommand implements Command {

    AirConditioner airConditioner;

    public TurnOffAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
