public class Instrumen {
    public String name;
    public String type;
    public String sound;

    public Instrumen(String name, String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void play(){
        System.out.println(sound);
    }

    public void displayInfo(){
        System.out.println("Имя: " + name + "\nТип: " + type + "\nЗвук: " + sound);
    }
}
