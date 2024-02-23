package abstraction;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getClass().getSimpleName());
        }
    }

    public void workAllEmployees() {
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
