package encapsulation;
import java.util.ArrayList;

// University class managing students, courses, and professors
class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Professor> professors;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        professors = new ArrayList<>();
    }

    public void admitStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " admitted.");
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getName() + " added.");
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void hireProfessor(Professor professor) {
        professors.add(professor);
        System.out.println("Professor " + professor.getName() + " hired.");
    }
}