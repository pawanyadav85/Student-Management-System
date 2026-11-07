void main() {
    Scanner sc = new Scanner(System.in);
    StudentService serv = new StudentService();
    int choice;
    int roll;
    String name;
    String course;
    do {
        IO.println("Select Student");
        IO.println("1.Add Student");
        IO.println("2.Remove Student");
        IO.println("3.view All Student");
        IO.println("4.Search Student");
        IO.println("5.Enroll course Student");
        IO.println("6.Drop Student");
        IO.println("7.View Student Courses");
        IO.println("8. Exit ");
        IO.println("Enter choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                IO.println("Enter Roll Number :");
                roll = sc.nextInt();
                IO.println("Enter Name : ");
                sc.nextLine();
                name = sc.nextLine();
                serv.addStudent(roll, name);
            }
            case 2 -> {
                IO.println("Enter roll to be removed");
                roll = sc.nextInt();
                serv.removeStudent(roll);
            }
            case 3 -> {
                serv.viewAllStudent();
            }
            case 4 -> {
                IO.println("Enter roll to be searched");
                roll = sc.nextInt();
                serv.searchStudentById(roll);
            }
            case 5 -> {
                IO.println("Enter roll for Enrollment");
                roll = sc.nextInt();
                IO.println("Enter course name to be Enrolled in");
                sc.nextLine();
                course = sc.nextLine();
                serv.enrollStudentInCourse(roll, course);
            }
            case 6 -> {
                IO.println("Enter roll for remove");
                roll = sc.nextInt();
                IO.println("Enter course name to be dropped");
                sc.nextLine();
                course = sc.nextLine();
                serv.dropCourse(roll, course);
            }
            case 7 -> {
                IO.println("Enter roll Number for displaying courses");
                roll = sc.nextInt();
                serv.getCourses(roll);
            }
            case 8 -> {
                IO.println("Thank you!");
            }
            default -> {
                IO.println("Wrong choice! try again");
            }

        }
    } while (choice != 8);
}
