package c.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hazel
 */

//어노테이션 만들기

@Target(ElementType.METHOD) //어노테이션을 어떤 것에 사용할지 정함 여기서는 method
@Retention(RetentionPolicy.RUNTIME) //어노테이션이 얼마나 오래 유지되는지 여기서는 실행시에 이 어노테이션 참조
public @interface UserAnnotation { //어노테이션을 선언할 때 사용

    public int number();

    public String text() default "hi this is first annotation";

}
