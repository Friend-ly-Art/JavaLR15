//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Instryment[] instruments = {
            new Guitar("Классическая гитара", 18000, 6),
            new Guitar("Электрогитара", 42000, 6),
            new Piano("Пианино Рояль", 350000, 88),
            new Guitar("Бас-гитара", 39000, 4),
            new Piano("Цифровое пианино", 72000, 88)
    };

    for (Instryment instrument : instruments) {
        instrument.displayInfo();
        instrument.tune();
        instrument.play();
        System.out.println();
    }
}
