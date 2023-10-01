import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private static Map<String, Robot> robotMap = new HashMap<>();

    public static Robot getRobots(String type) {
        if (!robotMap.containsKey(type)) {
            if (type.equals("Humanoid")) {
                robotMap.put("Humanoid", new Humanoid("Humanoid", new Sprites()));
            } else if (type.equals("RoboticDog")) {
                robotMap.put("RoboticDog", new RoboticDog("RoboticDog", new Sprites()));
            } else {
                throw new RuntimeException("Type should be either Humanoid/RoboticDog");
            }
        }
        return robotMap.get(type);
    }

}
