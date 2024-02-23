package abstraction;

public class Manager extends Employee {
    private String department;
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary); // used to call superclass method, and to access the superclass constructor
        this.department = department;
    }
    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department + " department.");
    }
}
