public class Server extends Computer {
    private final int rackUnits;

    public Server(String model, int id, int ram, int rackUnits) {
        super(model, id, ram);
        this.rackUnits = rackUnits;
    }

    @Override
    public String toString() {
        return "Сервер: " + super.toString()
                + ", высота=" + rackUnits + "U";
    }
}