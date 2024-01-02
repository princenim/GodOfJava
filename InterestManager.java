/**
 * @author hazel
 */

/*
은행에서 사용할 이율을 구하는 클래스
 */
public class InterestManager {
    public static void main(String[] args) {

        InterestManager interestManager = new InterestManager();
        for (int day = 10; day <= 365; day += 10) {
            double totalAmount = interestManager.calculateAmount(day, 1000000L);
            System.out.println(day + ":" + totalAmount + " ");
        }
    }

    public double getInterestRate(int day) {

        double interest = 0;

        if (day >= 365) {
            interest = 5.6; //5.6%
        } else if (day >= 181) {
            interest = 2;
        } else if (day >= 91) {
            interest = 1;
        } else {
            interest = 0.5;
        }
        return interest;
    }

    //예금 거치기간, 예금 금액
    public double calculateAmount(int day, long amount) {
        double interest = getInterestRate(day); //이자율

        double interestAmount = amount * (interest / 100);
        return amount + interestAmount; //예치금 + 이자

    }


}
