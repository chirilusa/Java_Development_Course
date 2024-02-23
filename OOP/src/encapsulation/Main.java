package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a university
        University university = new University();

        // Add some students
        Student student1 = new Student("Andreea", 001);
        university.admitStudent(student1);

        Student student2 = new Student("Madalin", 002);
        university.admitStudent(student2);

        // Add some professors
        Professor professor1 = new Professor("Dr. Farago", 101);
        university.hireProfessor(professor1);

        Professor professor2 = new Professor("Dr. Miclea", 102);
        university.hireProfessor(professor2);

        // Add some courses
        Course course1 = new Course("Introduction to Programming", 201, professor1);
        university.addCourse(course1);

        Course course2 = new Course("OOP", 202, professor2);
        university.addCourse(course2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display courses taught by professors
        System.out.println("Courses taught by Professor " + professor1.getName() + ":");
        for (Course course : university.getCourses()) {
            if (course.getProfessor() == professor1) {
                System.out.println("- " + course.getName());
            }
        }
    }
}
