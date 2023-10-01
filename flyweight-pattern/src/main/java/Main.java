public class Main {
    public static void main(String[] args) {
        Robot humanoid = RobotFactory.getRobots("Humanoid");
        humanoid.display(1, 2);

        Robot roboticDog = RobotFactory.getRobots("RoboticDog");
        roboticDog.display(2, 3);
        System.out.println(roboticDog.hashCode());

        Robot roboticDog2 = RobotFactory.getRobots("RoboticDog");
        System.out.println(roboticDog2.hashCode());
    }
}
