package f.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author hazel
 */
public class GetSum extends RecursiveTask<Long> {
    //from 부터 to까지 합을 구하는 클래스

    long from, to;

    public GetSum(long from, long to) { //생성자
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        long gap = to - from;

        if (gap <= 3) { //작업의 단위가 충분히 작을 경우 해당 작업을 수행 여기서는 3 이하
            long tmpSum = 0;
            for (long i = from; i <= to; i++) {
                tmpSum += i;
            }
            return tmpSum;
        }


        long middle = (from + to) / 2; //두 부분으로 나누어 작업을 수행하기 위해서 중간값을 찾는다.
        GetSum sumPre = new GetSum(from, middle);
        sumPre.fork(); //작업 하나 수행
        GetSum sumPost = new GetSum(middle + 1, to);

        return sumPost.compute() + sumPre.join(); //다른 작업을 (sumPost)를 수행한 후 이전에 시행한 작업을 기다린다.
        //fork는 여러개의 작업으로 나눈것. join은 나누어서 작업한 결과를 모으는 것
    }

    public void log(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "]" + message);
    }
}
