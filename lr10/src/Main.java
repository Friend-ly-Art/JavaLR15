//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Playable[] instruments = {
            new Guitar("Классическая гитара", 6, 2.5),
            new Guitar("Электрогитара", 6, 4.2),
            new Guitar("Бас-гитара", 4, 4.0),
            new Piano("Рояль", 88, 280.0),
            new Piano("Цифровое пианино", 88, 14.0)
    };

    for (Playable instrument : instruments) {
        instrument.tune();
        instrument.play();
        if (instrument instanceof Portable) {
            Portable portable = (Portable) instrument;
            portable.carry();
            System.out.printf("Вес: %.1f кг%n", portable.getWeight());
        }
        System.out.println();
    }
}
