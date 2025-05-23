//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        // 2 задание
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        //3 задание
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        //4 задание
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        //5 задание
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        //6 задание
        var mass1 = 78.2;
        var mass2 = 82.7;
        var generalmass = mass1 + mass2;
        System.out.println("общая масса = " + generalmass);
        var diffmass = mass2 - mass1;
        System.out.println("разница в массе = " + diffmass);
        //7 задание
        var ostatok = mass2 % mass1;
        System.out.println("остаток от деления = " + ostatok);
        // 8 задание
        var hours = 640;
        var hoursPerPerson = 8;
        var sotrudnik = hours / hoursPerPerson;
        System.out.println("Всего работников в компании - " + sotrudnik + " человек");
        sotrudnik = sotrudnik + 94;
        System.out.println("если в компании работает " + sotrudnik + " человек, то всего " + sotrudnik * hoursPerPerson + " часов работы может быть поделено между сотрудниками");
    }
}