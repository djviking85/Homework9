import java.util.Arrays;

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
        // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //
        //Напишите программу, которая решит эту задачу,
        // и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        int[] arr = generateRandomArray();
        int summaAll = 0;
        int maxTrati = +99999;
        int minTrati = +200000;
        for (int i = 0; i < arr.length; i++) {
            summaAll += arr[i];
            if (arr[i]>maxTrati) {
                maxTrati = arr[i];
            }
            if (arr[i]<minTrati) {
            minTrati = arr[i];
            }
        }
        System.out.println(" Сумма трат за месяц составила - " +summaAll+ " рублей");
        System.out.println(" Максимальная сумма трат в ДЕНЬ - " + maxTrati + " рублей");
        System.out.println(" Минимальныая сумма потрачена в ДЕНЬ - " + minTrati + " рублей");


    }
    public static void task3 () {
        System.out.println("Задача 3");
         // Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение
        // трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        // и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток,
        // то есть быть не целым, а дробным числом.
        int[] arr = generateRandomArray();
        double summaAll = 0;
        double maxTrati = +99999;
        double minTrati = +200000;
        for (int i = 0; i < arr.length; i++) {
            summaAll += arr[i];
            if (arr[i]>maxTrati) {
                maxTrati = arr[i];
            }
            if (arr[i]<minTrati) {
                minTrati = arr[i];
            }
        }
        double srednee = summaAll/30 ;
        System.out.println("Средняя сумма трат за месяц составила - " + srednee+ " рублей");
        System.out.println(" Сумма трат за месяц составила - " +summaAll+ " рублей");
        System.out.println(" Максимальная сумма трат в ДЕНЬ - " + maxTrati + " рублей");
        System.out.println(" Минимальныая сумма потрачена в ДЕНЬ - " + minTrati + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
         // В бухгалтерской книге появился баг.
        // Что-то пошло нет так — фамилии и имена сотрудников начали
        // отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        //
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                System.out.println(" как не должно быть  - " + Arrays.toString(reverseFullName));
        for (int i = 10; i < reverseFullName.length ; i--) {
            System.out.print(reverseFullName[i]);
            if (i == 0) {
                break;}

        }
        System.out.print("А теперь как надо  - " + Arrays.toString(reverseFullName));
    }
}