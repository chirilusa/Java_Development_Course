package encapsulation;

// Course class encapsulating course details
public class Course {
    private String name;
    private int courseId;
    private Professor professor;

    public Course (String name, int courseId, Professor professor) {
        this.name = name;
        this.courseId = courseId;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }
}
