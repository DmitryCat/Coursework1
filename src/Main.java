import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 75000, 1);
        employees[1] = new Employee("Глебов Глеб Глебович", 70000, 2);
        employees[2] = new Employee("Кириллов Кирилл Кириллович", 75000, 3);
        employees[3] = new Employee("Дмитриев Дмитрий Дмитриевич", 75000, 4);
        employees[4] = new Employee("Макисмов Максим Максимович", 74000, 5);
        employees[5] = new Employee("Вламиров Владимир Владимирович", 77000, 1);
        employees[6] = new Employee("Татьянова Татьяна Ивановна", 65000, 2);
        employees[7] = new Employee("Узбеков Узбек Узбекович", 45000, 3);
        employees[8] = new Employee("Огай Максим Витальевич", 375000, 4);
        employees[9] = new Employee("Савин Илья Иванович", 55000, 5);
        System.out.println(findMaxSalaryUseDepartment(employees, 1));
    }

    private static void printEmployeers(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    private static Employee findMinSalary(Employee[] employees) {
        int minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[minSalary].getSalary()) {
                minSalary = i;
            }
        }
        return employees[minSalary];
    }

    private static Employee findMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[maxSalary].getSalary()) {
                maxSalary = i;
            }
        }
        return employees[maxSalary];
    }

    private static double calculateAverageSalary(Employee[] employees) {
        int salarySum = sumSalary(employees);
        double averageSum = (double) salarySum / employees.length;
        return salarySum;
    }

    private static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private static void indexationSalary(Employee[] employees, double indexation) {
        for (int i = 0; i < employees.length; i++) {
            int valueSalary = employees[i].getSalary();
            double updateSalary = valueSalary * indexation;
            employees[i].setSalary((int) updateSalary);
        }
    }

    // Сумма зарплат по отделу
    private static int findSumSalaryUseDepartment(Employee[] employees, int valueDepartment) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == valueDepartment) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }
}



