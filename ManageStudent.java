/**
 * @author hazel
 */
public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        //student = manageStudent.addStudent();
        //manageStudent.printStudents(student);

        manageStudent.checkEquals();


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

    public void checkEquals() {
        //값이 같은 두 객체 생성
        Student a = new Student("Min", "HI", "0000", "AA");
        Student b = new Student("Min", "HI", "0000", "AA");

        //객체가 같으면 -> 객체의 값이 같은지 확인하려면 equals가 오버라이드 된 상태로 equal를 사용해야함. 단순 주소 비교는 == 로 가능!
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


    }
}
