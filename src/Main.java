//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        byte a = 120;
        short b = 32000;
        int c = 2000000000;
        long d = 900000000000L;
        float e = 6.21f;
        double f = 308.308f;
        System.out.println("начение перменной с типом byte равно " + a);
        System.out.println("начение перменной с типом short равно " + b);
        System.out.println("начение перменной с типом int равно " + c);
        System.out.println("начение перменной с типом long равно " + d);
        System.out.println("начение перменной с типом float равно " + e);
        System.out.println("начение перменной с типом double равно " + f);
        //2 задание
        float first = 27.12f;
        long second = 987678965549L;
        float third = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        //3 задание
        byte luda = 23;
        byte anna = 27;
        byte kata = 30;
        short list = 480;
        float listForStudent;
        listForStudent = list/(luda+anna+kata);
        System.out.println("каждому ученику достанеться по " + listForStudent + " листов");
        //4 задание
        byte bottlePer2Minute = 16;
        int bottlePer20Minute = bottlePer2Minute * 10;
        int bottlePerSutki = bottlePer2Minute * 720;
        int bottlePer3Sutki = bottlePer2Minute * 2160;
        long bottlePerMonth = bottlePer2Minute * 21600;
        System.out.println("за 20 минут машина произвела " + bottlePer20Minute + " бутылок");
        System.out.println("за сутки машина произвела " + bottlePerSutki + " бутылок");
        System.out.println("за 3 суток машина произвела " + bottlePer3Sutki + " бутылок");
        System.out.println("за месяц машина произвела " + bottlePerMonth + " бутылок");
        //5 задние
        byte allBanki = 120;
        byte brownBanki = 4;
        byte whiteBanki = 2;
        int clas = allBanki/(brownBanki+whiteBanki);
        System.out.println("в школу где " + clas + " классов. нужно "+ clas * whiteBanki + " банок белой краски и "+ clas * brownBanki + " коричневой краски");
        //6 задание
        byte banan = 5;
        int milk = 200;
        byte icecream = 2;
        byte egg = 4;
        double weight = banan * 80 + milk * 1.05 + icecream * 100 + egg * 70;
        double weightInKg = weight / 1000;
        System.out.println("вес напитка в граммах " + weight + " и в килограммах " + weightInKg);
        //7 задание
        int fallWeight = 7000;
        int slow = fallWeight / 250;
        int fast = fallWeight / 500;
        System.out.println("если спорцмен будет худеть по 250гр в день, то у него уйдёт  " + slow + " дней. А если по 500, то " + fast + " дней, в среднем можно похудеть за " + (fast + slow)/2 + " день");
        //8 задание
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        int newMasha = (int) (masha * 1.10);
        int newDenis = (int) (denis * 1.10);
        int newCristina = (int) (cristina * 1.10);
        System.out.println("маша теперь получает " + newMasha + " рублей её доход вырос на " + (newMasha - masha) + " рублей");
        System.out.println("денис теперь получает " + newDenis + " рублей его доход вырос на " + (newDenis - denis) + " рублей");
        System.out.println("кристина теперь получает " + newCristina + " рублей её доход вырос на " + (newCristina - cristina) + " рублей");
    }
}