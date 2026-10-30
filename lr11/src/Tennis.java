class Tennis extends Sport {
    public Tennis() {
        super("Теннис", 2, 120);
    }

    @Override
    public String getRules() {
        return "1 или 2 игрока";
    }
}