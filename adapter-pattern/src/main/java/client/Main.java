package client;

import adaptee.WeighingMachine;
import adaptee.WeighingMachineForBabies;
import adapter.WeighingMachineAdapter;
import adapter.WeightingMachineForAdults;

public class Main {
    public static void main(String[] args) {
        WeighingMachine weighingMachine = new WeighingMachineForBabies();
        WeighingMachineAdapter weighingMachineAdapter = new WeightingMachineForAdults(weighingMachine);
        System.out.println(weighingMachineAdapter.getWeightInKg());
    }
}
