import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String secondName;
    private int department;
    private int salary;
    private final int id;
    private static int nextId = 1;

    public Employee(String name, String surname, String secondName, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        this.id = nextId++;
    }

    public final int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id " + id + " работник: " + secondName + " " + name + " " + surname + " работает в " + department + " отделе и получает " + salary + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public static int getNextId() {
        return nextId;
    }
    //всё что в коментарии это повышеный уровень

    public int sumSalary(Employee[] rabi) {
        int sum = 0;
        for (int i = 0; i < nextId - 1; i++) {
            sum += rabi[i].getSalary();
        }
        return sum;
    }

    public void SearchMaxSalary(Employee[] rabi) {
        int max = 0;
        int s;
        int iter = 0;
        for (int i = 0; i < nextId - 1; i++) {
            s = rabi[i].getSalary();
            if (s > max) {
                max = s;
                iter = i;
            }
        }
        System.out.println("работник с максимальной оплатой " + rabi[iter]);
    }

    public void SearchMinSalary(Employee[] rabi) {
        int min = 1000000000;
        int s;
        int iter = 0;
        for (int i = 0; i < nextId - 1; i++) {
            s = rabi[i].getSalary();
            if (s < min) {
                min = s;
                iter = i;
            }
        }
        System.out.println("работник с минимальной оплатой " + rabi[iter]);
    }

    public int calculateAverageSalary(Employee[] rabi) {
        int sum = rabi[0].sumSalary(rabi);
        sum /= (nextId - 1);
        return sum;
    }

    public void printAllEmployers(Employee[] rabi) {
        for (int i = 0; i < nextId - 1; i++) {
            System.out.println(rabi[i].getSecondName() + " " + rabi[i].getName() + " " + rabi[i].getSurname());
        }
    }

    public void indexingSalary(Employee[] rabi, int percent) {
        int newSalary;
        for (int i = 0; i < nextId - 1; i++) {
            newSalary = rabi[i].getSalary() + (rabi[i].getSalary() / 100) * percent;
            setSalary(newSalary);
            System.out.println("новавя зарплата " + newSalary + " для работника " + rabi[i].getId());
        }
    }

    public void SearchMinSalary(Employee[] rabi, int department) {
        int min = 1000000000;
        int s = 1000000000;
        int iter = 0;
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                s = rabi[i].getSalary();
            }
            if (s < min) {
                min = s;
                iter = i;
            }
        }
        System.out.println("работник с минимальной оплатой " + rabi[iter]);
    }

    public void SearchMaxSalary(Employee[] rabi, int department) {
        int max = 0;
        int s = 0;
        int iter = 0;
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                s = rabi[i].getSalary();
            }
            if (s > max) {
                max = s;
                iter = i;
            }
        }
        System.out.println("работник с максимальной оплатой " + rabi[iter]);
    }

    public int sumSalary(Employee[] rabi, int department) {
        int sum = 0;
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                sum += rabi[i].getSalary();
            }
        }
        return sum;
    }

    public int calculateAverageSalary(Employee[] rabi, int department) {
        int sum = rabi[0].sumSalary(rabi, department);
        int quantity = rabi[0].calculateRabInDepartment(rabi, department);
        sum /= quantity;
        return sum;
    }

    public int calculateRabInDepartment(Employee[] rabi, int department) {
        int quantity = 0;
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                quantity += 1;
            }
        }
        return quantity;
    }

    public void indexingSalary(Employee[] rabi, int percent, int department) {
        int newSalary;
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                newSalary = rabi[i].getSalary() + (rabi[i].getSalary() / 100) * percent;
                setSalary(newSalary);
                System.out.println("новавя зарплата " + newSalary + " для работника " + rabi[i].getId());
            }
        }
    }

    public void printAllEmployers(Employee[] rabi, int department) {
        for (int i = 0; i < nextId - 1; i++) {
            if (rabi[i].getDepartment() == department) {
                System.out.println(rabi[i].getId() + " " + rabi[i].getSecondName() + " " + rabi[i].getName() + " " + rabi[i].getSurname() + " " + rabi[i].getSalary());
            }
        }
    }

    public void searchAllEmployeeWithSalaryLess(Employee[] rabi, int salaryMax) {
        for (int i = 0; i < nextId - 1; i++) {
            if (salaryMax > rabi[i].getSalary()) {
                System.out.println("у работника " + rabi[i] + " зарплата меньше " + salaryMax);
            }
        }
    }
    public void searchAllEmployeeWithSalaryBigger(Employee[] rabi, int salaryMin) {
        for (int i = 0; i < nextId - 1; i++) {
            if (salaryMin < rabi[i].getSalary()) {
                System.out.println("у работника " + rabi[i] + " зарплата выше " + salaryMin);
            }
        }
    }
}

