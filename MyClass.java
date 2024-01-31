import java.util.StringJoiner;

/**
 * @author hazel
 */
public class MyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        String[] stringArray = {"StudyHard", "GodOfJava", "Book"};
        myClass.joinStringOnlyComma(stringArray);


    }

    public void joinStringOnlyComma(String[] stringArray) {
        //StringJoiner joiner = new StringJoiner(",");
        StringJoiner joiner = new StringJoiner(",", "(", ")"); //맨 앞의 prefix와 뒤에 들어갈 suffix 포함.

        for (String string : stringArray) {
            joiner.add(string);
        }


        System.out.println(joiner);
    }

}
