//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

void main() {
    Map<String, Computer> computers = new HashMap<>();

    computers.put("Lenovo IdeaPad 5", new Laptop("Lenovo IdeaPad 5", 1, 16, 15.6));
    computers.put("ASUS VivoBook", new Laptop("ASUS VivoBook", 2, 8, 15.6));
    computers.put("Apple MacBook Air", new Laptop("Apple MacBook Air", 3, 16, 13.6));

    computers.put("HP Pavilion", new Desktop("HP Pavilion", 4, 16, "HP 24\""));
    computers.put("Dell OptiPlex", new Desktop("Dell OptiPlex", 5, 32, "Dell 27\""));
    computers.put("Acer Aspire TC", new Desktop("Acer Aspire TC", 6, 16, "Acer 24\""));

    computers.put("Dell PowerEdge R750", new Server("Dell PowerEdge R750", 7, 128, 2));
    computers.put("HPE ProLiant DL380", new Server("HPE ProLiant DL380", 8, 256, 2));

    System.out.println("ЗАДАНИЕ1:\nКлючи и значения Map<String, Computer>:");
    for (Map.Entry<String, Computer> entry : computers.entrySet()) {
        System.out.println("Ключ: " + entry.getKey());
        System.out.println("Значение: " + entry.getValue());
        System.out.println();
    }

    List<University> universities = new ArrayList<>(List.of(
            new University(1, "МГУ", "Россия", 1, List.of(5, 4, 5, 5)),
            new University(2, "СПбГУ", "Россия", 2, List.of(4, 4, 3, 4)),
            new University(3, "Оксфордский университет", "Великобритания", 3, List.of(5, 5, 4, 5)),
            new University(4, "Технический университет Мюнхена", "Германия", 4, List.of(2, 3, 2, 3)),
            new University(5, "Сорбонна", "Франция", 5, List.of(3, 3, 2, 3)),
            new University(6, "Токийский университет", "Япония", 6, List.of(4, 5, 4, 5)),
            new University(7, "Университет Торонто", "Канада", 7, List.of(2, 2, 3, 2)),
            new University(8, "Пекинский университет", "Китай", 8, List.of(5, 4, 5, 4))
    ));

    System.out.println("ЗАДАНИЕ2:\nУниверситеты со средним рейтингом ниже 3:");
    universities.stream()
            .filter(university -> university.getAverageRating() < 3)
            .forEach(System.out::println);

    for (University university : universities) {
        if (university.getAverageRating() >= 4) {
            university.setRank(university.getRank() + 1);
        }
    }

    System.out.println();
    University.printUniversities(universities, 2);

    System.out.println("\nУниверситеты по убыванию среднего рейтинга:");
    universities.stream()
            .sorted(Comparator.comparingDouble(University::getAverageRating).reversed()
                    .thenComparing(University::getName))
            .forEach(university -> System.out.printf("ID: %d, %s, средний рейтинг: %.2f%n",
                    university.getId(), university.getName(), university.getAverageRating()));

}
