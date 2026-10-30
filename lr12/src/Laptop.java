public class Laptop extends Computer {
    private final double screenSize;

    public Laptop(String model, int id, int ram, double screenSize) {
        super(model, id, ram);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + super.toString()
                + String.format(", диагональ экрана=%.1f\"", screenSize);
    }
}