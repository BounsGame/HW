//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int age = 10;
        if (age >= 18) {
            System.out.println("если возраст человека равен " + age + ", то он совершенно летний");
        }
        else {
            System.out.println("если возраст человека равен " + age + ", то он не достиг совершеннолетия, и нужно немного подождать");
        }
        // 2 задание
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("на улице " + temperature + " градусов. нужно надеть шапку");
        }
        else {
            System.out.println("на улице " + temperature + " градусов. можно идти без шапки");
        }
        //3 задание
        int speed = 60;
        if (speed > 60) {
            System.out.println("если скорость " + speed + ", то придёться заплатить штраф");
        }
        else {
            System.out.println("если скорость " + speed + ", то можно ездить спокойно");
        }
        //4 задание
        if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        else {
            if (age <= 17) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            }
            else {
                if(age <= 24) {
                    System.out.println("Если возраст человека равен " + age + " то его место в университете");
                }
                else {
                    System.out.println("Если возраст человека равен " + age + " то ему пара ходить на работу");
                }
            }
        }
        //5 задание
        boolean father = true;
        if (age < 5){
            System.out.println("Если возраст ребёнка равен " + age + " то ему нельзя кататься на атракционе");
        }
        else {
            if (age < 14){
                if (father) {
                    System.out.println("Если возраст ребёнка равен " + age + " то ему можно кататься на атракционе в сопровождении взрослого. взрослый есть кататься можно");
                }
                else {
                    System.out.println("Если возраст ребёнка равен " + age + " то ему можно кататься на атракционе в сопровождении взрослого. взрослого нет кататься нельзя");
                }
            }
            else {
                System.out.println("Если возраст ребёнка равен " + age + " то ему можно кататься на атракционе без сопровождения взрослого");
            }
        }
        //6 задание
        int people = 100;
        if (people < 60) {
            System.out.println("В вагоне есть " + (60 - people) + " свободных сидячих мест");
        }
        else {
            if (people < 102) {
                System.out.println("В вагоне есть " + (102 - people) + " свободных стоячих мест");
            }
            else {
                System.out.println("В вагоне нет мест");
            }
        }
        //7 задание
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        }
        else {
            if (two > three){
                System.out.println("Число " + two + " самое большое");
            }
            else {
                System.out.println("Число " + three + " самое большое");
            }
        }
    }
}