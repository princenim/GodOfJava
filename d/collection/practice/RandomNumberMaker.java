package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

/**
 * @author hazel
 */
public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberMaker.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> set = new HashSet<>(6);
        while (true) {
            Random random = new Random();
            int i = random.nextInt(45); // 0 부터 45까지 임의의 숫자 리턴

            set.add(i);
            if (set.size() == 6) {
                break;
            }
        }


        return set;

    }

}
