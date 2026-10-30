//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Sport[] sports = {new Football(), new Tennis()};

    for (Sport sport : sports) {
        sport.displayInfo();
        System.out.println("Правила: " + sport.getRules());
        sport.play();
        sport.play("Динамо");
        sport.play(sport.players);
        System.out.println();
    }
}