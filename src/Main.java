import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Второе задание
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Третье задание
        for(int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Четвертое задание
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Пятое задание
        for(int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является висоскосным");
        }

        //Шестое задание
        for(int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //Седьмое задание
        for(int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //Восьмое задание
        int bank = 0;
        int salary = 29000;
        for(int month = 1; month <= 12; month++) {
            bank += salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + bank + " рублей");
        }

        //Девятое задание
        int bank1 = 0;
        int salary1 = 29000;
        for(int month = 1; month <= 12; month++) {
            bank1 += salary1;
            bank1 *= 1.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + bank1 + " рублей");
        }

        //Десятое задание
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }

        //2 урок 1 задание
        int bank2 = 0;
        int month1 = 0;
        while (bank2 < 2_460_000) {
            bank2 += 15000;
            month1++;
        }
        System.out.println("Месяц " + month1 + ", сумма накоплений равна " + bank2 + " рублей");

        //2 урок 2 задание
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print(i+" ");
        while (i > 1) {
            i--;
            System.out.print(i+" ");
        }

        //2 урок 3 задание
        System.out.println();
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int k = 0;
        do {
            population = ((population / 1000) * born) + population - ((population / 1000) * death);
            k++;
            System.out.println("Год " + k + ", численность населения составляет " + population);
        }
        while (k < 10);

        //2 урок 4 задание
        int check = 15000;
        int percent = 7;
        int m = 0;
//        do {
//            check = ((check / 100) * 7) + check;
//            m++;
//            System.out.println("Месяц " + m + " сумма накоплений равна " + check);
//        }
//        while (check < 12_000_000);

        //2 урок 5 задание
        do {
            check = ((check / 100) * 7) + check;
            m++;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " сумма накоплений равна " + check);
            }
        }
        while (check < 12_000_000);

        //2 урок 6 задание
        int check1 = 15000;
        int years = 9;
        int yearHalf = years * 2;
        int n = 0;
        int h = 0;
        do {
            check1 = ((check1 / 100) * 7) + check1;
            n++;
            if (n % 6 == 0) {
                h++;
                System.out.println("Полугодие " + h + " сумма накоплений равна " + check1);
            }
        }
        while (h < yearHalf);

        //2 урок 7 задание
        int firstFriday = 5;
        int monthDay = 31;
        int o = 5;
        System.out.println("Сегодня пятница, " + (firstFriday) + "-е число. Необходимо подготовить отчет");
        while (o < monthDay) {
            o++;
            if (o % 7 == 0 && o < monthDay - firstFriday) {
                System.out.println("Сегодня пятница, " + (o + firstFriday) + "-е число. Необходимо подготовить отчет");
            }
        }

        //2 урок 8 задание
        int y = 0;
        int comet = 79;
        int todayYear = 2024;
        do {
            y = y + comet;
            if (y > todayYear - 200 && y < todayYear + 100) {
                System.out.println(y);
            }
        }
        while (y < todayYear + 100);
    }
}