package lambda.functional;

/**
 * @author hazel
 */
public class Functional {

//    private void runCommonThread() {
//
//        Runnable runnable = () -> { //Runnable인터페이스를 람다로 표현
//            //내가 오버라이딩해 구현할 메소드
//            System.out.println(Thread.currentThread().getName());
//        };
//
//        new Thread(runnable).start();
//    }
//
//    private void runThread(){
//        new Thread(() ->{
//            System.out.println(Thread.currentThread().getName());
//        }).start();
//    }

    private void runThread() {
        //익명클래스를 사용하는 이유 : 익명클래스를 클래스와 인터페이스로 사용할 수 있는데 해당 예제는 인터페이스이다.
        //이렇게 인터페이스를 익명클래스를 사용함으로써 인터페이스를 구현하는 클래스를 따로 만들 필요가 없어
        // 메소드안에서 인스턴스화해서 한번만 사용하고 버릴때 사용한다.
        Runnable runnable = new Runnable() {//Runnable 인터페이스를 익명클래스로 구현
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        new Thread(runnable).start();
    }

    //위의 예제를 더 간결하게 줄인것
    private void runThreadSimple() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

}
