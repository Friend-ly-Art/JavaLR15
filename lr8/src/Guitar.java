public class Guitar extends Instrumen {
    public int strings;

    public Guitar(String name, String type, String sound, int strings){
        super(name, type, sound);
        this.strings = strings;
    }

    public void play(){
        System.out.println("Издаёт струнный звук: ");
        super.play();
    }

    public void tune(){
        System.out.println("Настройка гитары");
    }
}
