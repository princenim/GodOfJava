package f.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @author hazel
 */
public class ForkJoinSample {


    static final ForkJoinPool mainPool = new ForkJoinPool(); //해당 클래스를 사용해서 작업 시작


    public static void main(String[] args) {

        ForkJoinSample forkJoinSample = new ForkJoinSample();
        forkJoinSample.calculate();
    }

    public void calculate() {
        long from = 0;
        long to = 10;

        GetSum sum = new GetSum(from, to);
        Long result = mainPool.invoke(sum); //작업 시작 호출 후 결과 대기함.
        System.out.println("Fork Join : Total sum of " + from + " ~ " + to + "=" + result);


    }

}
