class Football extends Sport {
    public Football() {
        super("Футбол", 22, 90);
    }

    @Override
    public String getRules() {
        return "11 игроков, 2 тайма";
    }
}
