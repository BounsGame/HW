//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        //для красоты
        System.out.println("");
        //2 задание
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //снова для красоты
        System.out.println("");
        //3 задание
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        //снова для красоты
        System.out.println("");
        //4 задание
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        //снова для красоты
        System.out.println("");
        //5 задание
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.print(year + " ");
        }
        //снова для красоты
        System.out.println("");
        //6 задание
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        //снова для красоты
        System.out.println("");
        //7 задание
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        //снова для красоты
        System.out.println("");
        //8 задание
        int bank = 0;
        for (int i = 1; i <= 12; i++) {
            bank = bank + 29000;
            System.out.println("месяц " + i + " сумма накоплений равна " + bank + " рублей");
        }
        //9 задание
        bank = 0;
        for (int i = 1; i <= 12; i++) {
            bank = (int) (bank * 1.01) + 29000;
            System.out.println("месяц " + i + " сумма накоплений равна " + bank + " рублей");
        }
        //10 задание
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}