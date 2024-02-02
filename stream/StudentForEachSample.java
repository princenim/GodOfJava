package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hazel
 */
public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();

        ArrayList<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("정", 100, 100, 100));
        studentList.add(new StudentDTO("현", 80, 80, 80));
        studentList.add(new StudentDTO("이", 70, 10, 10));

        //sample.printStudentNames(studentList);
        sample.printStudentsNameMathEnglish(studentList);
    }

    public void printStudentNames(List<StudentDTO> students) {
        //컬렉션을 스트림객체로 만들고 해당 객체 하나하나를 돌면서 이름을 출력한다.
        students.stream().forEach(studentDTO -> System.out.println(studentDTO.getName()));

        //map은 데이터를 특정 데이터로 변환한다 즉 코드에서 StdentDTO라는 객체가 아니라 getName의 결과인 string을 반환한다.
        students.stream().map(studentDTO -> studentDTO.getName()).forEach(name -> System.out.println(name));
    }

    public void printStudentsNameMathEnglish(List<StudentDTO> students) {
        students.stream().forEach(studentDTO -> System.out.println(studentDTO.getName() + " " + studentDTO.scoreMath + " " + studentDTO.getScoreEnglish()));

    }

}
