package lambda.functional;

/**
 * @author hazel
 */
@FunctionalInterface //람다는 인터페이스의 메소드가 1개일때만 사용할수있다. 따라서 해당 어노테이션이 있는데 메소드가 추가되면 컴파일에서 에러가뜬다.
public interface Calculate { // 추상 메서드가 1개일때 함수형 인터페이스
    int operation(int a, int b);


}
