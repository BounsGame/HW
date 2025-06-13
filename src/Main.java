//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("установите версию приложения для iOS по ссылке");
            break;
            case 1:
                System.out.println("установите версию приложение для Android по ссылке");
            break;
            default:
                System.out.println("извинете для вашей OS у нас нету приложения");
        }
        //2 задание
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("установите версию приложения для iOS по ссылке");
                } else System.out.println("установите облегчённую версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("установите версию приложение для Android по ссылке");
                } else System.out.println("установите облегчённую версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("извинете для вашей OS у нас нету приложения");
        }
        //3 задание
        int year = 2021;
        if ((year % 4) == 0 && year >= 1584) {
            if ((year % 100) != 0 || (year % 400) == 0) {
                System.out.println(year + " год являеться високосным");
            }else System.out.println(year + " год не являеться високосным");
        } else System.out.println(year + " год не являеться високосным");
        //4 задание
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("потребуеться дней: " + 1);
        } else if (deliveryDistance < 60){
            System.out.println("потребуеться дней: " + 2);
        } else if (deliveryDistance < 100){
            System.out.println("потребуеться дней: " + 3);
        } else System.out.println("мы не доставляем карты на дистанцию свыше 100км");
        //5 задание
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("этот месяц принадлежит к зиме");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("этот месяц принадлежит к весне");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("этот месяц принадлежит к лету");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("этот месяц принадлежит к осени");
            break;
            default:
                System.out.println("такого месяца нет");
        }
    }
}