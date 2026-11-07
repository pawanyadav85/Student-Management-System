import java.util.Set;
import java.util.TreeSet;

public class Student {
    private int roll;
    private String name;
    private Set<String>courseName;
    public Student(int roll , String name ){
        this.roll = roll;
        this.name = name;
        this.courseName = new TreeSet<>();
    }
    public boolean enrollCourse(String course){
        return courseName.add(course);
    }
    public boolean removeCourse(String course){
        return courseName.remove(course);
    }

    public Set<String> getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", courseName=" + courseName +
                '}';
    }
}
