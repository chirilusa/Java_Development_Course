package encapsulation;

public class Professor {
    private String name;
    private int id;

    public Professor (String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
}
