import java.util.*;

public class StudentService {

    private List<Student> stList;
    private Map<Integer, Student> stMap;

    public StudentService() {
        stMap = new HashMap<>();
        stList = new ArrayList<>();
    }

    public void addStudent(int roll, String name) {
        if (stMap.containsKey(roll)) {
            System.out.println("Roll no " + roll + " already present");
            return;
        }
        Student s = new Student(roll, name);
        stMap.put(roll, s);
        stList.add(s);
        System.out.println("student with roll: " + roll + " added successfully");
    }

    public void removeStudent(int roll) {
        Student s = stMap.remove(roll);
        if (s == null) {
            System.out.println("Roll Number not found!");
            return;
        }
        stList.remove(s);
        System.out.println(
                "Student with roll " + roll +
                        " removed successfully!"
        );
    }

    public void viewAllStudent() {
        if (stMap.isEmpty()) {
            System.out.println("Not record found!");
            return;
        }
        for (Student s : stList) {
            System.out.println(s);
        }
    }

    public void searchStudentById(int roll) {
        Student s = stMap.get(roll);
        if (s == null) {
            System.out.println("Roll no not found!");
            return;
        }
        System.out.println(s);
    }

    public void enrollStudentInCourse(int roll, String course) {
        Student s = stMap.get(roll);
        if (s == null) {
            System.out.println("Roll no Not Found!");
            return;
        }
        if (s.enrollCourse(course)) {
            System.out.println("Student " + roll + " Sucessfully enrolled in course :" + course);
        } else {
            System.out.println("Student " + roll + "already enrolled in course: " + course);
        }
    }

    public void dropCourse(int roll, String course) {
        Student s = stMap.get(roll);
        if (s == null) {
            System.out.println("Roll no Not Found!");
            return;
        }
        if (s.removeCourse(course)) {
            System.out.println("Course: " + course + " Sucessfully remove from student: " + roll);
        } else {
            System.out.println("Student " + roll + "not enrolled in course: " + course);
        }
    }

    public void getCourses(int roll) {
        Student s = stMap.get(roll);
        if (s == null) {
            System.out.println("Roll no Not Found!");
            return;
        }
        Set<String> courseNames = s.getCourseName();
        if (courseNames.isEmpty()) {
            System.out.println("Student :" + roll + " Not enroll in any course yet!");
        } else {
            System.out.println(courseNames);
        }
    }
}
