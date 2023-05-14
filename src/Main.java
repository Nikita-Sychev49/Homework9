import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxExpenses = 1;
        int minExpenses = 300_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpenses) {
                maxExpenses = arr[i];
            }
            if (arr[i] < minExpenses) {
                minExpenses = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей, а минимальная сумма трат за день составила " + minExpenses + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (double i = 0; i < arr.length; i++) {
            sum += arr[(int) i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
    
