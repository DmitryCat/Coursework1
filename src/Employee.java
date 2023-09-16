public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private int id;
    private static int counter = 0;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО='" + fullName + '\'' +
                ", Зарплата=" + salary +
                ", Отдел=" + department +
                ", id=" + id +
                '}';
    }
}
