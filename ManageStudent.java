/**
 * @author hazel
 */
public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);


    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("CHOI", "SEOUl", "010-1111-1111", "zzzz@gamil.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student data : students) {
            System.out.println(data);

        }

    }
}
