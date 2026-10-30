import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Path directory = java.nio.file.Paths.get("lr14_files");
        try (Scanner scanner = new Scanner(System.in)) {
            Files.createDirectories(directory);
            task1(directory);
            task2(directory, scanner);
            task3(directory);
            task4(directory, scanner);
            task5(directory);
            System.out.println("\nВсе файлы сохранены в папке: " + directory.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    // 1. Создать файл о будущей профессии, вывести сведения о файле и его содержимое.
    private static void task1(Path directory) throws IOException {
        Path file = directory.resolve("profession.txt");
        Files.write(file, Arrays.asList("Моя будущая профессия — разработчик программного обеспечения.",
                        "Я хочу создавать полезные приложения и изучать новые технологии."),
                java.nio.charset.StandardCharsets.UTF_8);

        BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class);
        System.out.println("Задание 1. Сведения о файле:");
        System.out.println("Имя: " + file.getFileName());
        System.out.println("Размер: " + attributes.size() + " байт");
        System.out.println("Последнее изменение: " + attributes.lastModifiedTime());
        System.out.println("Содержимое файла:");
        for (String line : Files.readAllLines(file, java.nio.charset.StandardCharsets.UTF_8)) {
            System.out.println(line);
        }
    }

    // 2. Записать 10 введённых целых чисел в файл и посчитать числа выше среднего.
    private static void task2(Path directory, Scanner scanner) throws IOException {
        Path file = directory.resolve("f_task2.txt");
        System.out.println("\nЗадание 2. Введите 10 целых чисел:");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(readInt(scanner, "Число " + (i + 1) + ": "));
        }
        Files.write(file, numbers.stream().map(String::valueOf).collect(Collectors.toList()));

        List<Integer> fromFile = Files.readAllLines(file).stream().map(Integer::parseInt).collect(Collectors.toList());
        double average = fromFile.stream().mapToInt(Integer::intValue).average().orElse(0);
        long greaterCount = fromFile.stream().filter(number -> number > average).count();
        System.out.println("Числа из файла: " + fromFile);
        System.out.printf("Среднее арифметическое: %.2f%n", average);
        System.out.println("Чисел больше среднего: " + greaterCount);
    }

    // 3. Создать случайные числа и разделить трёхзначные и остальные.
    private static void task3(Path directory) throws IOException {
        Path source = directory.resolve("f_task3.txt");
        Path threeDigitFile = directory.resolve("g_task3.txt");
        Path otherFile = directory.resolve("h_task3.txt");
        List<Integer> numbers = RANDOM.ints(20, -999, 1000).boxed().collect(Collectors.toList());
        List<Integer> threeDigit = new ArrayList<>();
        List<Integer> other = new ArrayList<>();
        for (int number : numbers) {
            if (Math.abs(number) >= 100 && Math.abs(number) <= 999) {
                threeDigit.add(number);
            } else {
                other.add(number);
            }
        }
        Files.write(source, numbers.stream().map(String::valueOf).collect(Collectors.toList()));
        Files.write(threeDigitFile, threeDigit.stream().map(String::valueOf).collect(Collectors.toList()));
        Files.write(otherFile, other.stream().map(String::valueOf).collect(Collectors.toList()));
        System.out.println("\nЗадание 3. Случайные числа: " + numbers);
        System.out.println("Трёхзначные (файл g): " + threeDigit);
        System.out.println("Остальные (файл h): " + other);
    }

    // 4. Записать 12 введённых значений массы и вычислить среднее.
    private static void task4(Path directory, Scanner scanner) throws IOException {
        Path file = directory.resolve("mass.txt");
        System.out.println("\nЗадание 4. Введите 12 значений массы тела в кг:");
        List<Double> masses = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            double mass;
            do {
                mass = readDouble(scanner, "Масса " + (i + 1) + ": ");
                if (mass <= 0) {
                    System.out.println("Масса должна быть больше нуля.");
                }
            } while (mass <= 0);
            masses.add(mass);
        }
        Files.write(file, masses.stream().map(String::valueOf).collect(Collectors.toList()));
        double average = Files.readAllLines(file).stream()
                .mapToDouble(Double::parseDouble).average().orElse(0);
        System.out.printf("Средняя масса: %.2f кг%n", average);
    }

    // 5. Создать файл из 10 целых чисел и посчитать числа, оканчивающиеся на 5.
    private static void task5(Path directory) throws IOException {
        Path file = directory.resolve("f_task5.txt");
        List<Integer> numbers = RANDOM.ints(10, -100, 101).boxed().collect(Collectors.toList());
        Files.write(file, numbers.stream().map(String::valueOf).collect(Collectors.toList()));
        List<Integer> fromFile = Files.readAllLines(file).stream().map(Integer::parseInt).collect(Collectors.toList());
        long count = fromFile.stream().filter(number -> Math.abs(number) % 10 == 5).count();
        System.out.println("\nЗадание 5. Числа в файле: " + fromFile);
        System.out.println("Количество чисел, оканчивающихся на 5: " + count);
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Введите целое число.");
            scanner.next();
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Введите число, используя точку для дробной части.");
            scanner.next();
        }
    }
}

