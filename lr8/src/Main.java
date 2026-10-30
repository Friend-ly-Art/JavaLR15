//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Instrumen[] instruments = new Instrumen[5];
    instruments[0] = new Guitar("Ямаха", "акустика", "Звонкий", 6);
    instruments[1] = new Guitar("Оскар Шмид", "классика", "Насыщенный", 7);
    instruments[2] = new Guitar("Буб", "бас", "Высокий", 4);
    instruments[3] = new Piano("Ямаха", "электро", "Не настоящий", 22);
    instruments[4] = new Piano("Биб", "класика", "Настоящий", 44);

    for(int i = 0; i < instruments.length; i++){
        System.out.println("\nИнструмент " + (i+1) + ": ");
        instruments[i].displayInfo();
        instruments[i].play();
    }
    Guitar gut1 = new Guitar("Оскар Шмид", "классика", "Насыщенный", 7);
    gut1.tune();
    Piano pin1 = new Piano("Биб", "класика", "Настоящий", 44);
    pin1.playChord();

}
