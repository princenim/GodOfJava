package c.annotation;

import java.lang.reflect.Method;

/**
 * @author hazel
 */
public class UserAnnotationCheck {
    //내가 만든 어노테이션을 사용한 클래스으 결과를 확인하는 클래스
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UseAnnotationSample.class); //내가 만든 어노테이션을 사용한 클래스 호출
    }

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods(); // 해당 클래스에 선언되어있는 메소드들의 목록을 배열로 리턴
        for (Method tmpMethod : methods) {
            System.out.println(tmpMethod.getName());
            UserAnnotation annotation = tmpMethod.getAnnotation(UserAnnotation.class);

            //해당 메소드에 선언되어있는 매개변수로 넘겨준 어노테이션을 확인 후 , 있을 경우 어노테이션의 객체를 리턴해준다.

            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tmpMethod.getName() + "() : number=" + number + " text=" + text);
            } else {
                System.out.println(tmpMethod.getName() + "() : annotion is null");
            }
            System.out.println("=========================================");
        }


    }

}
