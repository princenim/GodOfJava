package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

/**
 * @author hazel
 */
public class RandomNumberStatistics {

    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics randomNumberStatistics = new RandomNumberStatistics();
        randomNumberStatistics.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int num = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(num);
        }

        printStatistics();
    }

    public void putCurrentNumber(int tmpNumber) {
        if (hashtable.containsKey(tmpNumber)) {
            hashtable.put(tmpNumber, hashtable.get(tmpNumber) + 1);
        } else {
            hashtable.put(tmpNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keys = hashtable.keySet();
        for (Integer tmpKey : keys) {

            System.out.print(tmpKey + "=" + hashtable.get(tmpKey));
            System.out.print(" ");
            if (tmpKey % 10 - 1 == 0) {
                System.out.println();
            }
        }


    }
}
