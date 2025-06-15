//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int bank = 0;
        int i = 0;
        while (bank <= 2459000) {
            i++;
            bank += 15000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank + " рублей");
        }
        //2 задание
        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //для красоты
        System.out.println();
        //3 задание
        int population = 12000000;
        int change = 17 - 8;
        for (i = 1; i <= 10; i++) {
            population += (population / 1000 * change);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        //4 задание
        bank = 15000;
        i = 0;
        while (bank <= 12000000) {
            i++;
            bank *= 1.07;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank + " рублей");
        }
        //5 задание
        bank = 15000;
        i = 0;
        while (bank <= 12000000) {
            i++;
            bank *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + bank + " рублей");
            }
        }
        //6 задание
        bank = 15000;
        i = 0;
        while (i <= 108) {
            i++;
            bank *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + bank + " рублей");
            }
        }
        //7 задание
        int day = 1;
        for (i = 1; i <= 31; i++) {
            if (day == 8) day = 1;
            if (day == 5) System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
            day += 1;
        }
        //8 задание
        int actualYear = 2025;
        int periodBegin = actualYear - 200;
        int periodEnd = actualYear + 100;
        while (periodBegin < periodEnd) {
            if (periodBegin % 79 == 0) System.out.println(periodBegin);
            periodBegin += 1;
        }
    }
}