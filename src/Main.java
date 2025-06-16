import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] five = {1, 2, 3, 4, 5};
        //2 задание
        for (int i = 0; i <= integer.length - 1; i++) {
            if (i != integer.length - 1) System.out.print(integer[i] + ", ");
            else System.out.print(integer[i]);
        }
        System.out.println();
        for (int i = 0; i <= fractional.length - 1; i++) {
            if (i != fractional.length - 1) System.out.print(fractional[i] + ", ");
            else System.out.print(fractional[i]);
        }
        System.out.println();
        for (int i = 0; i <= five.length - 1; i++) {
            if (i != five.length - 1) System.out.print(five[i] + ", ");
            else System.out.print(five[i]);
        }
        System.out.println();
        //3 задание
        for (int i = 0; i <= integer.length - 1; i++) {
            if (i != integer.length - 1) System.out.print(integer[integer.length - 1 - i] + ", ");
            else System.out.print(integer[integer.length - 1 - i]);
        }
        System.out.println();
        for (int i = 0; i <= fractional.length - 1; i++) {
            if (i != fractional.length - 1) System.out.print(fractional[fractional.length - 1 - i] + ", ");
            else System.out.print(fractional[fractional.length - 1 - i]);
        }
        System.out.println();
        for (int i = 0; i <= five.length - 1; i++) {
            if (i != five.length - 1) System.out.print(five[five.length - 1 - i] + ", ");
            else System.out.print(five[five.length - 1 - i]);
        }
        System.out.println();
        //4 задание
        for (int i = 0; i <= integer.length - 1; i++) {
            if (i % 2 == 0) integer[i] += 1;
        }
        System.out.println(Arrays.toString(integer));
    }
}