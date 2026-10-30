public class Piano extends Instryment {
    private final int keys;

    public Piano(String name, double price, int keys) {
        super(name, "пианино", price);
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println(name + ": издает клавишный звук");
    }

    @Override
    public void tune() {
        System.out.println(name + ": настраивается с помощью ключа");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество клавиш: " + keys);
    }
}
