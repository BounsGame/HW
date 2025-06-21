import java.util.Arrays;

public class EmployeeBook {
    int maxRab = 10;
    private Employee[] rabi = new Employee[maxRab];

    public boolean addEmployee (){
        for (int i = 0; i < maxRab ; i++) {
            if (rabi [i] == null) {
                rabi[i] = new Employee("Danil", "Denisovich", "Matveev", 3, 150000);
                return true;
            }
        }
        return false;
    }
    public void deleteEmployee (int id){
        for (int i = 0; i < maxRab ; i++){
            if (rabi[i].getId() == id){
                rabi[i] = null;
                return;
            }
        }
        throw new IllegalArgumentException("работника с таким id не существует");
    }

    public Employee[] getRabi() {
        return rabi;
    }
    public Employee getElement (int index){
        return rabi[index];
    }

    public Employee searchId (int id) {
        for (int i = 0; i < maxRab; i++) {
            if (rabi[i].getId() == id) {
                return rabi[i];
            }
        }
        throw new IllegalArgumentException("работника с таким id не существует");
    }


    public int sumSalary() {
        int sum = 0;
        for (int i = 0; i < maxRab; i++) {
            sum += rabi[i].getSalary();
        }
        return sum;
    }

    public void SearchMaxSalary() {
        int max = 0;
        int s;
        int iter = 0;
        for (int i = 0; i < maxRab; i++) {
            s = rabi[i].getSalary();
            if (s > max) {
                max = s;
                iter = i;
            }
        }
        System.out.println("работник с максимальной оплатой " + rabi[iter]);
    }

    public void SearchMinSalary() {
        int min = 1000000000;
        int s;
        int iter = 0;
        for (int i = 0; i < maxRab; i++) {
            s = rabi[i].getSalary();
            if (s < min) {
                min = s;
                iter = i;
            }
        }
        System.out.println("работник с минимальной оплатой " + rabi[iter]);
    }

    public int calculateAverageSalary() {
        int sum = sumSalary();
        sum /= maxRab;
        return sum;
    }

    public void printAllEmployers(Employee[] rabi) {
        for (int i = 0; i < maxRab; i++) {
            System.out.println(rabi[i].getSecondName() + " " + rabi[i].getName() + " " + rabi[i].getSurname());
        }
    }

    public void indexingSalary(int percent) {
        int newSalary;
        for (int i = 0; i < maxRab; i++) {
            newSalary = rabi[i].getSalary() + (rabi[i].getSalary() / 100) * percent;
            rabi[i].setSalary(newSalary);
            System.out.println("новавя зарплата " + newSalary + " для работника " + rabi[i].getId());
        }
    }

    public void SearchMinSalary(int department) {
        int min = 1000000000;
        int s = 1000000000;
        int iter = 0;
        for (int i = 0; i < maxRab; i++) {
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

    public void SearchMaxSalary(int department) {
        int max = 0;
        int s = 0;
        int iter = 0;
        for (int i = 0; i < maxRab; i++) {
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

    public int sumSalary(int department) {
        int sum = 0;
        for (int i = 0; i < maxRab; i++) {
            if (rabi[i].getDepartment() == department) {
                sum += rabi[i].getSalary();
            }
        }
        return sum;
    }

    public int calculateAverageSalary(int department) {
        int sum = sumSalary(department);
        int quantity = calculateRabInDepartment(department);
        sum /= quantity;
        return sum;
    }

    public int calculateRabInDepartment(int department) {
        int quantity = 0;
        for (int i = 0; i < maxRab; i++) {
            if (rabi[i].getDepartment() == department) {
                quantity += 1;
            }
        }
        return quantity;
    }

    public void indexingSalary(int percent, int department) {
        int newSalary;
        for (int i = 0; i < maxRab; i++) {
            if (rabi[i].getDepartment() == department) {
                newSalary = rabi[i].getSalary() + (rabi[i].getSalary() / 100) * percent;
                rabi[i].setSalary(newSalary);
                System.out.println("новавя зарплата " + newSalary + " для работника " + rabi[i].getId());
            }
        }
    }

    public void printAllEmployers(int department) {
        for (int i = 0; i < maxRab; i++) {
            if (rabi[i].getDepartment() == department) {
                System.out.println(rabi[i].getId() + " " + rabi[i].getSecondName() + " " + rabi[i].getName() + " " + rabi[i].getSurname() + " " + rabi[i].getSalary());
            }
        }
    }

    public void searchAllEmployeeWithSalaryLess(int salaryMax) {
        for (int i = 0; i < maxRab; i++) {
            if (salaryMax > rabi[i].getSalary()) {
                System.out.println("у работника " + rabi[i] + " зарплата меньше " + salaryMax);
            }
        }
    }

    public void searchAllEmployeeWithSalaryBigger(int salaryMin) {
        for (int i = 0; i < maxRab; i++) {
            if (salaryMin < rabi[i].getSalary()) {
                System.out.println("у работника " + rabi[i] + " зарплата выше " + salaryMin);
            }
        }
    }

    @Override
    public String toString() {
        return "EmployeeBook{" + Arrays.toString(rabi) + '}';
    }

    public void  printAllInfo (){
        for (int i = 0; i < maxRab; i++){
            System.out.println(rabi[i]);
        }
    }
}
