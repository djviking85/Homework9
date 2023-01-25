public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Напишите программу, которая решит эту задачу, и выведите в
        // консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] arr = generateRandomArray();
        int summaAll = 0;
        for (int i = 0; i < arr.length; i++) {
          summaAll += arr[i];
        }
        System.out.println(" Сумма трат за месяц составила - " +summaAll+ " рублей");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int summaAll = 0;
        for (int i = 0; i < arr.length; i++) {
            summaAll += arr[i];
        }
        System.out.println(" Сумма трат за месяц составила - " +summaAll+ " рублей");


    }
    public static void task3 () {
        System.out.println("Задача 3");
         // Пишем код для задачи 1
    }
    public static void task4 () {
        System.out.println("Задача 4");
         // Пишем код для задачи 1
    }
}