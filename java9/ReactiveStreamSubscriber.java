package java9;

import java.util.Random;
import java.util.concurrent.Flow;

/**
 * @author hazel
 */
public class ReactiveStreamSubscriber implements Flow.Subscriber<Integer> {
    //subscriber은 메세지를 받는 사람 즉 클리이언트 입장

    private Flow.Subscription subscription; //데이터를 주고받을 때 사용
    private String name;
    private boolean completed;

    public ReactiveStreamSubscriber(String name) { //생성자 - 처음 생성하면 completed는 false
        this.name = name;
        boolean completed = false;
    }


    @Override
    public void onSubscribe(Flow.Subscription subscription) {// 결과를 받음
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Integer item) { //다음아이템이 존재할때
        Random random = new Random();
        int randomTime = random.nextInt(1000);
        sleep(randomTime);

        System.out.println("[" + name + "] Received item: " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable error) { //에러 발생 시
        System.out.println("Error occured: " + error.getMessage());
    }

    @Override
    public void onComplete() { // 완료되었을 때
        completed = true;
        System.out.println("[" + name + "]" + "ReactiveStreamSubscriber is complete");
    }


    public boolean isCompleted() {
        return completed;
    }


    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
