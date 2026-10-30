class Guitar implements Playable, Portable {
    private final String name;
    private final int strings;
    private final double weight;

    public Guitar(String name, int strings, double weight) {
        this.name = name;
        this.strings = strings;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println(name + " звучит: игра на " + strings + " струнах");
    }

    @Override
    public void tune() {
        System.out.println(name + " настроена");
    }

    @Override
    public void carry() {
        System.out.println(name + " можно переносить в чехле");
    }

    @Override
    public double getWeight() {
        return weight;
    }
}