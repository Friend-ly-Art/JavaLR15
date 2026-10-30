//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Table table = new Table(1.2, "дуб");
    System.out.printf("Стол: материал — %s, диаметр — %.2f м, площадь — %.3f м²%n",
            table.getMaterial(), table.getDiameter(), table.area());
}
