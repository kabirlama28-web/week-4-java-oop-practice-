class Employee {
    private String name;
    private int id;
    protected double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double rate = 500;

    Developer(String name, int id, double baseSalary, int overtimeHours) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * rate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {

        Employee e1 = new Manager("Ram", 1, 50000, 10000);
        Employee e2 = new Developer("Shyam", 2, 40000, 10);

        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}