package implementor;

public class WaterBreatheImplementation implements BreatheImplementation {
    @Override
    public void breathe() {
        System.out.println("Breathe through Gills");
        System.out.println("Absorb O2 from water");
        System.out.println("Exhale CO2 into water");
    }
}
