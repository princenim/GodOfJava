package c.annotation;

/**
 * @author hazel
 */
public class UseAnnotationSample {
    //내가 만든 어노테이션을 사용하는 클래스
    @UserAnnotation(number = 0)
    public static void main(String[] args) {
        UseAnnotationSample sample = new UseAnnotationSample();


    }

    @UserAnnotation(number = 1)
    public void annotationSample1() {

    }

    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2() {

    }

    @UserAnnotation(number = 3, text = "hi")
    public void annotationSample3() {

    }


}

