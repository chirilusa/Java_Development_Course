package abstraction;

public class Main {
    public static void main(String[] args) {

        // Create instances of different employees
        Manager manager = new Manager("Chirilus Andreea", 1001, 60000, "Finance");
        Developer developer = new Developer("Clipici Madalin", 2001, 50000, "Java");
        Designer designer = new Designer("Pop Andreea", 3001, 55000, "Adobe Illustrator");

        // Create a Company instance
        Company company = new Company();

        // Add employees to the Company
        company.addEmployee(manager);
        company.addEmployee(developer);
        company.addEmployee(designer);

        // List all employees
        company.listEmployees();

        // Make all employees work
        company.workAllEmployees();
    }
}
