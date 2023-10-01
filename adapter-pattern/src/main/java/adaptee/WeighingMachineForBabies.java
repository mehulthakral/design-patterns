package adaptee;

import java.util.Scanner;

public class WeighingMachineForBabies implements WeighingMachine {
    @Override
    public double getWeightInPound() {
        System.out.println("Please provide weight in pound");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
//        return 8;
    }
}
