import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int year = 2007;
        checkLeanYear(year);
        //2 задание
        int clientOS = 1;
        int clientDeviceYear = 2020;
        printAppDownload(clientOS, clientDeviceYear);
        //3 задание
        int deliveryDistance = 27;
        int day = calculateDeliveryDay(deliveryDistance);
        if (day != 0) {
            System.out.println("потребуеться дней: " + day);
        } else {
            System.out.println("мы не доставляем карты на дистанцию свыше 100км");
        }
    }

    public static void checkLeanYear(int year) {
        if ((year % 4) != 0 || year < 1584) {
            System.out.println(year + " год — невисокосный год");
        } else if ((year % 100) != 0 || (year % 400) == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void printAppDownload(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDay(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}