//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    //Найти индекс первого вхождения символа 'а' в строке
    System.out.print("Задание 1:\nВведите строку: ");
    String stroka = scan.next();
    if (stroka.indexOf('a') == -1) {
        System.out.println("Символ 'а' не найден");
    } else {
        System.out.println("Индекс символа 'а' = " + stroka.indexOf('a'));
    }

    //Извлечь из email доменную часть (часть после @).
    System.out.print("Задание 2:\nВведите email: ");
    String email = scan.next();
    if (email.contains("@")) {
        System.out.println("Доменная часть: " + email.substring(email.indexOf('@') + 1));
    } else {
        System.out.println("Введена неправильная почта!");
    }

    //класс
    System.out.println("Задание 3:");
    Employee[] employees = {
            new Employee("Иванов", 45678.5),
            new Employee("Петров", 78900.0),
            new Employee("Сидоров", 12345.678),
            new Employee("Кузнецов", 98765.43)
    };

    Report.generateReport(employees);

    //Дана строка 'xzzx xzxx xxxx xabx x12x xAax'. Найти и вывести
    //строки, где по краям стоит 'x', а между ними – ровно две любые цифры.
    System.out.print("Задание 4:\n");
    String text = "xzzx xzxx xxxx xabx x12x xAax";
    Pattern pattern = Pattern.compile("x\\d{2}x");
    Matcher match = pattern.matcher(text);

    while (match.find()) {
        System.out.println(match.group());
    }


}
