public class Computer {
    protected final String model;
    protected final int id;
    protected final int ram;

    public Computer(String model, int id, int ram) {
        this.model = model;
        this.id = id;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("%s [id=%d, RAM=%d ГБ]", model, id, ram);
    }
}