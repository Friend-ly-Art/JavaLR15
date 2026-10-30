public class Guitar extends Instryment {
    private final int strings;

    public Guitar(String name, double price, int strings) {
        super(name, "гитара", price);
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println(name + ": издает струнный звук");
    }

    @Override
    public void tune() {
        System.out.println(name + ": настраивается с помощью тюнера");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество струн: " + strings);
    }

}
