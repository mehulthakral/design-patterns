package implementor;

public class LandBreatheImplementation implements BreatheImplementation {
    @Override
    public void breathe() {
        System.out.println("Breathe through Nose");
        System.out.println("Inhale O2");
        System.out.println("Exhale CO2");
    }
}
