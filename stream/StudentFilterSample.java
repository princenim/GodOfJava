package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hazel
 */
public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("아", 10, 10, 130));
        studentList.add(new StudentDTO("마", 90, 10, 130));
        studentList.add(new StudentDTO("가", 10, 10, 130));

        sample.filterWithScoreForLoop(studentList, 80);


    }

    //스트림 필터를 사용한 예제 - 80점 이상을 출력
    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
        studentList.stream().filter(student -> student.getScoreMath() > scoreCutLine).forEach(student -> System.out.println(student.getName()));


    }

}
