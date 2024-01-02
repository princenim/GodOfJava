/**
 * @author hazel
 */
public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();
        System.out.println("Real monthlySalary:"+sm.getMonthlySalary(20000000));
    }

    //합달 급여를 계산하는 메소드
    public double getMonthlySalary(int yearlySalary){
        double monthSalary = yearlySalary / 12.0; //정확한 계산을 위해 12.0으로 나눠야함.
        System.out.println("월 급여: " + monthSalary);

        double tax = calculateTax(monthSalary);
        double nationalTax = calculateNationalPension(monthSalary);
        double insuranceTax = calculateHealthInsurance(monthSalary);

        System.out.println("한달 근로소득세: " + tax);
        System.out.println("한달 국민연금: " + nationalTax);
        System.out.println("한달 건강보험료: " + insuranceTax);
        double totalTax = tax + nationalTax + insuranceTax;
        monthSalary -= totalTax;

        return monthSalary;
    }

    public double calculateTax(double monthlySalary) {
        double tax=monthlySalary*(12.5/100);
        return tax;
    }
    public double calculateNationalPension(double monthlySalary) {
        double nationalPension=monthlySalary*(8.1/100);
        return nationalPension;
    }
    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance=monthlySalary*(13.5/100);
        return healthInsurance;
    }

}
