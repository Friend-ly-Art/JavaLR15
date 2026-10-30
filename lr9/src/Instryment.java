public abstract  class Instryment {
    protected final String name;
    protected final String type;
    protected final double price;

    protected Instryment(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public abstract void play();
    public abstract void tune();

    public void displayInfo() {
        System.out.printf("%s: тип — %s, цена — %.2f руб.%n", name, type, price);
    }
}
