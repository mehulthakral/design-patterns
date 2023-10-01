public class Humanoid implements Robot {

    private String type;
    private Sprites body;

    public Humanoid(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        System.out.printf("Displaying %s at (%d, %d)%n", type, x, y);
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }
}
