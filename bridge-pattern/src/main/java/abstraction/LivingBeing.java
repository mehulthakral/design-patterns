package abstraction;

import implementor.BreatheImplementation;

public abstract class LivingBeing {

    BreatheImplementation breatheImplementation;

    public LivingBeing(BreatheImplementation breatheImplementation) {
        this.breatheImplementation = breatheImplementation;
    }

    public abstract void breatheProcess();

}
