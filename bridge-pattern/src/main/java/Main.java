import abstraction.Dog;
import abstraction.Fish;
import abstraction.LivingBeing;
import implementor.LandBreatheImplementation;
import implementor.WaterBreatheImplementation;

public class Main {
    public static void main(String[] args) {
        LivingBeing dog = new Dog(new LandBreatheImplementation());
        dog.breatheProcess();

        LivingBeing fish = new Fish(new WaterBreatheImplementation());
        fish.breatheProcess();
    }


}
