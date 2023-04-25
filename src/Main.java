public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        int month = 0;
        while (total < 2_459_000) {
            month = month + salary;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int difference = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            y += y * difference / 1000;
            System.out.println("Год " + i + " численность населения составляет " + y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15_000;
        int i = 1;
        for (i = 1; sum <= 12_000_000; i++) {
            sum += sum * 0.07;
            System.out.println("Потребуется месяцев " + i + " чтобы накопить " + sum + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15_000;
        int i = 1;
        for (i = 1; sum <= 12_000_000; i++) {
            sum += sum * 0.07;
            if (i % 6 == 0)
                System.out.println("Потребуется месяцев " + i + " чтобы накопить " + sum + " рублей");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15_000;
        int i = 1;
        for (i = 1; i <= 108; i++) {
            sum += sum * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц  " + i + " сумма накоплений " + sum + " рублей");
            }
        }
        System.out.println("Сумма накоплений спустя 9 лет " + sum);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        for (friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometYear = 0;
        while (cometYear <= endYear) {
            cometYear = 79 * ((cometYear / 79) + 1);
            if (cometYear >= startYear && cometYear <= endYear) {
                System.out.println(cometYear);
            }
        }
    }
}

