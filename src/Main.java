import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int[] budget = {15000, 10000, 12000, 25000, 18000};
        int sum = 0;
        for (int i : budget) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //2 задание
        int max = budget[0];
        int min = budget[0];
        for (int i : budget) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        //3 задание
        float average = sum / budget.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        //4 задание
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char s;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            s = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = s;
        }
        for (char i : reverseFullName) {
            System.out.print(i);
        }
    }
}