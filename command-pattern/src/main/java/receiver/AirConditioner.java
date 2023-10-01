package receiver;

public class AirConditioner {
    private boolean isOn;
    private int temp;

    public AirConditioner() {
        isOn = false;
        temp = 24;
    }

    public void turnOnAc() {
        isOn = true;
        System.out.println("AC has been turned on");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("AC has been turned off");
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
