package abstraction;

public class Designer extends Employee {
    private String designTool;

    public Designer(String name, int employeeId, double salary, String designTool) {
        super(name, employeeId, salary);
        this.designTool = designTool;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is designing using " + designTool + ".");
    }
}

