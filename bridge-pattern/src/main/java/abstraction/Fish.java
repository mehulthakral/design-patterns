package abstraction;

import implementor.BreatheImplementation;

public class Fish extends LivingBeing {

    public Fish(BreatheImplementation breatheImplementation) {
        super(breatheImplementation);
    }

    @Override
    public void breatheProcess() {
        breatheImplementation.breathe();
    }
}
