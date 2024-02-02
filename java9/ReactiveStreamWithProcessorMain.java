package java9;

import java.util.concurrent.SubmissionPublisher;

/**
 * @author hazel
 */
public class ReactiveStreamWithProcessorMain {
    public static void main(String[] args) throws InterruptedException {

        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>(); //publisher
        ReactiveStreamProcessor processor = new ReactiveStreamProcessor(); //processor

        ReactiveStreamSubscriber subsciber1 = new ReactiveStreamSubscriber("subsriber1");
        ReactiveStreamSubscriber subsciber2 = new ReactiveStreamSubscriber("subsriber2");

        publisher.subscribe(processor); //publisher가 processor를 전달할것. (약 구독의 의미)
        processor.subscribe(subsciber1); //processor가 두 subscriber에게 전달할것.
        processor.subscribe(subsciber2);


        System.out.println("Submitting items");

        for (int i = 0; i < 5; i++) {
            publisher.submit(i); //실제 메세지 전달 onNext()메소드 사용
            System.out.println("PUBLISHER published to process item [" + i + "]");
            Thread.sleep(1);
        }

        processor.close();

        while (true) {
            if (subsciber1.isCompleted() && subsciber2.isCompleted()) {
                break;
            }
            Thread.sleep(1000);

        }
        System.out.println("Done!");

    }
}
