class Desktop extends Computer {
    private final String monitor;

    public Desktop(String model, int id, int ram, String monitor) {
        super(model, id, ram);
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Настольный компьютер: " + super.toString()
                + ", монитор=" + monitor;
    }
}