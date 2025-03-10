import java.util.Vector;

public class Main {
    public static void firstTask() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void secondTask() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void thirdTask() {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void fourthTask() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void fifthTask() {
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0)
                System.out.println(i);
        }
    }

    public static void sixthTask() {
        for (int i = 1; i <= 14; i++) {
            System.out.println(i * 7);
        }
    }

    public static void seventhTask() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void eighthTask() {
        Vector<String> month = new Vector<>();
        month.add("Январь");
        month.add("Февраль");
        month.add("Март");
        month.add("Апрель");
        month.add("Май");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        month.add("Сентябрь");
        month.add("Октябрь");
        month.add("Ноябрь");
        month.add("Декабрь");
        int tmp = 0;
        for (int i = 0; i < 12; i++) {
            tmp += 29000;
            System.out.println(month.get(i) + ", сумма накоплений равна " + tmp + " рублей");
        }
    }

    public static void ninethTask() {
        Vector<String> month = new Vector<>();
        month.add("Январь");
        month.add("Февраль");
        month.add("Март");
        month.add("Апрель");
        month.add("Май");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        month.add("Сентябрь");
        month.add("Октябрь");
        month.add("Ноябрь");
        month.add("Декабрь");
        float tmp = 0;
        float perYear = 12;//можно менять, программа адаптируется, под другой годовой процент
        float perMonth = ((perYear / 12) / 100) + 1;
        for (int i = 0; i < 12; i++) {
            tmp *= perMonth;
            tmp += 29000;
            System.out.println(month.get(i) + ", сумма накоплений равна " + tmp + " рублей");
        }
    }

    public static void tenthTask() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        firstTask();
        System.out.println("\nЗадание 2");
        secondTask();
        System.out.println("\nЗадание 3");
        thirdTask();
        System.out.println("\nЗадание 4");
        fourthTask();
        System.out.println("\nЗадание 5");
        fifthTask();
        System.out.println("\nЗадание 6");
        sixthTask();
        System.out.println("\nЗадание 7");
        seventhTask();
        System.out.println("\nЗадание 8");
        eighthTask();
        System.out.println("\nЗадание 9");
        ninethTask();
        System.out.println("\nЗадание 10");
        tenthTask();
    }
}