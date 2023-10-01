package abstraction;

import implementor.BreatheImplementation;

public class Dog extends LivingBeing {

    public Dog(BreatheImplementation breatheImplementation) {
        super(breatheImplementation);
    }

    @Override
    public void breatheProcess() {
        breatheImplementation.breathe();
    }
}
