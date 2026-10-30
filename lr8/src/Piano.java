public class Piano extends Instrumen {
    public int keys;

    public Piano(String name, String type, String sound, int keys){
        super(name, type, sound);
        this.keys = keys;
    }

    public void play(){
        System.out.println("Издаёт клавишный звук");
        super.play();
    }

    public void playChord(){
        System.out.println("Настройка пианино");
    }
}
