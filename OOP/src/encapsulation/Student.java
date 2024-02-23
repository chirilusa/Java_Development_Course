package encapsulation;
import java.util.ArrayList;

// Student class encapsulating student details
public class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student (String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void enrollCourse (Course course) {
        courses.add(course);
        System.out.println(name + " enrolled in course: " + course.getName());
    }

    public void displayCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course: courses) {
            System.out.println("- " + course.getName());
        }
    }
}
