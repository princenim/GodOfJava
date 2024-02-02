package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hazel
 */
public class StreamMap {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //stream map을 사용해 값 자체를변경
        intList.stream().map(x -> x * 3).forEach(System.out::println);


        //해당 list에서 이름만들 뽑고 싶다면?
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("아", 10, 10, 130));
        studentList.add(new StudentDTO("마", 10, 10, 130));
        studentList.add(new StudentDTO("가", 10, 10, 130));

        studentList.stream().map(studentDTO -> studentDTO.getName()).forEach(System.out::println); //이름만 출력
        List<String> nameList = studentList.stream().map(studentDTO -> studentDTO.getName()).collect(Collectors.toList());//모아서 List로 변환
        System.out.println(nameList);


    }
}
