//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aa = 1;
        while(aa == 1)
        {
            System.out.println("Выберите задание: 1, 2 или 3");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Задание 1\nВведите радиус: ");
                    int r = scan.nextInt();
                    double result = 2 * Math.PI * r;
                    System.out.println("Длина окружности: " + result);
                    break;
                case 2:
                    System.out.println("Задание 2\nВведите коэффициенты: ");
                    System.out.print("a = ");
                    double a = scan.nextDouble();
                    System.out.print("b = ");
                    double b = scan.nextDouble();
                    System.out.print("c = ");
                    double c = scan.nextDouble();
                    if (a == 0) {
                        System.out.println("Это не квадратное уравнение (a = 0)");
                    } else {
                        double discriminant = b * b - 4 * a * c;
                        System.out.println("Дискриминант D = " + discriminant);

                        if (discriminant > 0) {
                            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                            System.out.print("D > 0:\nx1 = " + x1 + "\nx2 = " + x2);
                        } else if (discriminant == 0) {
                            double x = -b / (2 * a);
                            System.out.print("D = 0:\nx = " + x);
                        } else {
                            System.out.println("D < 0: Нет корней");
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nЗадание 3\nВведите число: ");
                    int number = scan.nextInt();
                    int originalNumber = number;
                    number = Math.abs(number);
                    int sum = 0;
                    while (number > 0) {
                        sum += number % 10;
                        number /= 10;
                    }

                    System.out.println("Сумма цифр числа " + originalNumber + " = " + sum);
                    break;
                case 4:
                    String town = scan.next();
                    switch (town){
                        case "Moscow":
                            System.out.println("Россия");
                            break;
                        default:
                            break;
                    }
                default:
                    aa = 2;
                    break;
            }
        }
        scan.close();
    }
}