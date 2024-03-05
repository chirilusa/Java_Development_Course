package Single_Responsability;

class BadEmployee {
    private String name;
    private String role;
    public BadEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public void generateReport(String data) {
        if (role.equals("Manager")) {
            System.out.println("Generating manager report for " + name + ": " + data);
        } else if (role.equals("Developer")) {
            System.out.println("Generating developer report for " + name + ": " + data);
        } else if (role.equals("HR")) {
            System.out.println("Generating HR report for " + name + ": " + data);
        }
    }

    public void calculateSalary(int hoursWorked, double hourlyRate) {
        double salary;
        if (role.equals("Manager")) {
            salary = hoursWorked * hourlyRate * 1.5;
        } else if (role.equals("Developer")) {
            salary = hoursWorked * hourlyRate;
        } else if (role.equals("HR")) {
            salary = hoursWorked * hourlyRate * 1.2;
        } else {
            throw new IllegalArgumentException("Invalid role");
        }

        System.out.println("Calculating salary for " + name + ": " + salary);
    }

    public static void main(String[] args) {
        BadEmployee badEmployee = new BadEmployee("Chirilus Andreea", "Developer");
        badEmployee.generateReport("Quarterly Sales Report");
        badEmployee.calculateSalary(40, 25.0);
    }
}
