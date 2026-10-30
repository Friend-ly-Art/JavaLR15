class Piano implements Playable, Portable {
    private final String name;
    private final int keys;
    private final double weight;

    public Piano(String name, int keys, double weight) {
        this.name = name;
        this.keys = keys;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println(name + " звучит: игра на " + keys + " клавишах");
    }

    @Override
    public void tune() {
        System.out.println(name + " настроено мастером");
    }

    @Override
    public void carry() {
        System.out.println(name + " переносится с помощью грузчиков");
    }

    @Override
    public double getWeight() {
        return weight;
    }
}