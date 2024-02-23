package abstraction;

public abstract class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee (String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public abstract  void work();
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId() {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
