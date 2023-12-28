import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sumFor = 0;
        for (int j : array) {
            sumFor += j;
        }
        System.out.println("Сумма (for): " + sumFor);

        int sumWhile = 0, i = 0;
        while (i < array.length) {
            sumWhile += array[i];
            i++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        int sumDoWhile = 0, j = 0;
        if (array.length > 0) {
            do {
                sumDoWhile += array[j];
                j++;
            } while (j < array.length);
        }
        System.out.println("Сумма (do-while): " + sumDoWhile);


        System.out.print("\nВведите количество аргументов командной строки: ");
        int argCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите аргументы командной строки:");
        for (int g = 0; g < argCount; g++) {
            System.out.println(scanner.nextLine());
        }

        System.out.println("\nПервые 10 чисел гармонического ряда:");
        for (int r = 1; r <= 10; r++) {
            System.out.print(1.0 / i + " ");
        }
        System.out.println();

        System.out.print("\nВведите размер массива случайных чисел: ");
        int randomArraySize = scanner.nextInt();
        int[] randomArray = generateRandomArray(randomArraySize);
        System.out.println("Случайный массив:");
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));

        System.out.print("\nВведите число для вычисления факториала: ");
        int number = scanner.nextInt();
        System.out.println("Факториал числа " + number + " равен " + factorial(number));

        scanner.close();
    }

    static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
