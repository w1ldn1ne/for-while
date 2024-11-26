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
    }
}