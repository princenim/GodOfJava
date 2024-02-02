package java9;

import java.util.concurrent.SubmissionPublisher;

/**
 * @author hazel
 */
public class ReactiveStreamMain {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>(); //SubmissionPublisher를 이용해 메세지 전송


        //메세지를 받는 2개의 subscriber
        ReactiveStreamSubscriber subscriber1 = new ReactiveStreamSubscriber("subscribe1");
        ReactiveStreamSubscriber subscriber2 = new ReactiveStreamSubscriber("subscribe2");
        publisher.subscribe(subscriber1); //메세지를 전달할 subsciber들
        publisher.subscribe(subscriber2);
        System.out.println("Submitting items");

        for (int i = 0; i < 5; i++) {
            publisher.submit(i); //메세지(아이템을) 차례대로 보내기 , onNext()사용해 subscriber에게 메세지를 보낸다.
            //Publishes the given item to each current subscriber by asynchronously invoking its onNext method,
            // blocking uninterruptibly while resources for any subscriber are unavailable
            System.out.println("published: " + i);
        }

        publisher.close();
        while (true) {
            if (subscriber1.isCompleted() && subscriber2.isCompleted()) {
                break;
            }
            Thread.sleep(100);
        }

    }

}
