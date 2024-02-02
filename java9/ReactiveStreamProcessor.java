package java9;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * @author hazel
 */
public class ReactiveStreamProcessor extends SubmissionPublisher<Integer> implements Flow.Subscriber<Integer> {
    //SubmissionPublisher 클래스를 확장 하고 Subscriber 인터페이스를 구현
    //processor란 publisher는 subscriber를 모르고 그냥 processor에게 전달하면 processor가 알아서 subscriber에게 전달한다.

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Integer item) {
        submit(item * 10);
        System.out.println("PROCESSOR published to subscriber item [ " + item + "]");
        subscription.request(1);
    }

    @Override
    public void onError(Throwable error) {
        error.printStackTrace();
        closeExceptionally(error);
    }

    @Override
    public void onComplete() {
        System.out.println("ReactiveStreamProcessor Completed!");
        close();
    }
}
