package Single_Responsability;
class Employee {
    private String name;
    private String role;
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
}
class ReportGenerator {
    public static void generateReport(Employee employee, String data) {
        String reportType = getReportType(employee.getRole());
        System.out.println("Generating " + reportType + " report for " + employee.getName() + ": " + data);
    }

    private static String getReportType(String role) {
        if (role.equals("Manager")) {
            return "manager";
        } else if (role.equals("Developer")) {
            return "developer";
        } else if (role.equals("HR")) {
            return "HR";
        } else {
            throw new IllegalArgumentException("Invalid role");
        }
    }
}

class SalaryCalculator {
    public static void calculateSalary(Employee employee, int hoursWorked, double hourlyRate) {
        double salary;
        if (employee.getRole().equals("Manager")) {
            salary = hoursWorked * hourlyRate * 1.5;
        } else if (employee.getRole().equals("Developer")) {
            salary = hoursWorked * hourlyRate;
        } else if (employee.getRole().equals("HR")) {
            salary = hoursWorked * hourlyRate * 1.2;
        } else {
            throw new IllegalArgumentException("Invalid role");
        }

        System.out.println("Calculating salary for " + employee.getName() + ": " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Pop Alina", "Developer");

        ReportGenerator.generateReport(employee,"Code Review Report");
        SalaryCalculator.calculateSalary(employee,40, 30.0);
    }
}