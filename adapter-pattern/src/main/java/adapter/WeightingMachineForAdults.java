package adapter;

import adaptee.WeighingMachine;

public class WeightingMachineForAdults implements WeighingMachineAdapter {

    WeighingMachine weighingMachine;

    public WeightingMachineForAdults(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        return weighingMachine.getWeightInPound() * 0.45;
    }
}
