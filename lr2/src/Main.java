import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //   int[] array = {5, 0, -3, 0, 8, 0, 2, 0, 1, 0};

        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        System.out.println("Колличество нулей в массиве: " + count);

        System.out.println("Задание 2");
        int[][] array1 = {
                {5, -3, 7, -1},
                {0, -8, 2, -4},
                {-6, 3, -9, 1},
                {4, -2, 0, -7}
        };
        int count1 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] < 0) {
                    count1++;
                }
            }
        }
        System.out.println("Количество отрицательных элементов: " + count1);
    }
}