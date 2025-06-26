import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //это код для повышеной сложности
        /*
        Employee[] rabi = new Employee[10];
        rabi[0] = new Employee("Danil", "Denisovich", "Matveev", 3, 150000);
        rabi[1] = new Employee("Ivan", "Ivanovich", "Ivanov", 1, 10000);
        rabi[2] = new Employee("Igor", "Alexeevich", "Alexandrov", 2, 100000);
        rabi[3] = new Employee("Nikita", "Nikitovich", "Nikitov", 5, 12000);
        rabi[4] = new Employee("Sergey", "Sergeevich", "Sergeev", 4, 50000);
        rabi[5] = new Employee("Artem", "Artemovich", "Artemov", 3, 110000);
        rabi[6] = new Employee("Denis", "Denisovich", "Denisov", 2, 120000);
        rabi[7] = new Employee("Anton", "Antonovich", "Antonov", 1, 12000);
        rabi[8] = new Employee("Andrei", "Andreevich", "Anreev", 5, 15000);
        rabi[9] = new Employee("Alexandr", "Alexandrovich", "Alexandrov", 4, 70000);
        Employee rabotniki = rabi[0];

        for (int i = 0; i < 10; i++) {
            System.out.println(rabi[i]);
        }

        System.out.println("сумма всех зарплат " + rabotniki.sumSalary(rabi));
        rabotniki.SearchMinSalary(rabi);
        rabotniki.SearchMaxSalary(rabi);
        System.out.println("Средняя зарплата в компании " + rabotniki.calculateAverageSalary(rabi));
        rabotniki.printAllEmployers(rabi);
        rabotniki.indexingSalary(rabi, 8);
        rabotniki.SearchMinSalary(rabi, 4);
        rabotniki.SearchMaxSalary(rabi, 2);
        System.out.println("сумма всех зарплат по отделу " + rabotniki.sumSalary(rabi, 3));
        System.out.println("Средняя зарплата в отделе " + rabotniki.calculateAverageSalary(rabi, 1));
        rabotniki.indexingSalary(rabi, 10, 3);
        rabotniki.printAllEmployers(rabi, 3);
        rabotniki.searchAllEmployeeWithSalaryLess(rabi, 80000);
        rabotniki.searchAllEmployeeWithSalaryBigger(rabi, 80000);*/


        // это код для очень сложного уровня сложности
        EmployeeBook rabotniki = new EmployeeBook();
        for (int i = 0; i < 10; i++) {
            rabotniki.addEmployee();
        }
        rabotniki.printAllInfo();
        rabotniki.deleteEmployee(5);
        rabotniki.printAllInfo();
        rabotniki.addEmployee();
        System.out.println(rabotniki.getElement(1));
        System.out.println(rabotniki.sumSalary());
        System.out.println("сумма всех зарплат " + rabotniki.sumSalary());
        rabotniki.SearchMinSalary();
        rabotniki.SearchMaxSalary();
        System.out.println("Средняя зарплата в компании " + rabotniki.calculateAverageSalary());
        rabotniki.printAllEmployers(3);
        rabotniki.indexingSalary(8);
        rabotniki.SearchMinSalary( 3);
        rabotniki.SearchMaxSalary(3);
        System.out.println("сумма всех зарплат по отделу " + rabotniki.sumSalary(3));
        System.out.println("Средняя зарплата в отделе " + rabotniki.calculateAverageSalary(3));
        rabotniki.indexingSalary(10, 3);
        rabotniki.printAllEmployers(3);
        rabotniki.searchAllEmployeeWithSalaryLess(80000);
        rabotniki.searchAllEmployeeWithSalaryBigger(80000);
    }
}
