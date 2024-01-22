package e.thread.practice;

import java.util.Date;

/**
 * @author hazel
 */
public class TimerThread extends Thread {
    //쓰레드 클래스
    public void run() {
        //printCurrentTime();
        printCurrentTime2nd();


    }

    public void printCurrentTime() {

        try {
            int cnt = 0;
            while (cnt < 10) {
                Thread.sleep(1000); //1초
                long currentTime = System.currentTimeMillis();//1970년 1월 1일로부터 경과한 시간을 long으로 리턴
                System.out.println(new Date(currentTime) + " + " + currentTime); //현재 시간 출력
                cnt++;
            }

        } catch (Exception e) {

        }


    }


    public void printCurrentTime2nd() {

        try {
            int cnt = 0;
            while (cnt < 10) {

                long currentTime = System.currentTimeMillis();//1970년1월 1일로부터 경과한 시간을 long으로 리턴
                System.out.println(new Date(currentTime) + " + " + currentTime); //현재 시간 출력
                reduceTimeGap();
                cnt++;
            }

        } catch (Exception e) {

        }


    }

    public void reduceTimeGap() {
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try {
            Thread.sleep(1000 - timeMod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
