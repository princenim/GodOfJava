package d.string.practice.lang;

/**
 * @author hazel
 */
public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem javaLangSystem = new JavaLangSystem();
        //javaLangSystem.systemPropertiesCheck();

        javaLangSystem.numberMinMaxElapsedCheck();
    }

    public void systemPropertiesCheck() {
        System.out.println("java version= " + System.getProperty("java.version"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME")); //JDK 설치 경로
    }


    public void numberMinMaxElapsedCheck() {
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis(); //현재 시간을 밀리초 단위로 리턴
        long startNanoTime = System.nanoTime(); // 현재 시간을 나노초 단위로 리턴

        numberSample.numberMinMaxCheck();


        System.out.println("Milli second = " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));


    }

}
