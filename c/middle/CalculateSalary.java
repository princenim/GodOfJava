package c.middle;

/**
 * @author hazel
 */
public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculatedSalaries();
    }


    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();

        switch (employee.getType()) {
            case 1:
                return (long) (salary - (salary * 0.95));
            case 2:
                return (long) (salary + (salary * 0.1));
            case 3:
                return (long) (salary + (salary * 0.2));
            case 4:
                return (long) (salary + (salary * 0.3));
            case 5:
                return salary * 2;
        }

        return 0;
    }

    public void calculatedSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Lee", 1, 1000000000);
        employees[1] = new Employee("Kim", 2, 100000000);
        employees[2] = new Employee("Whang", 3, 70000000);
        employees[3] = new Employee("Park", 4, 80000000);
        employees[4] = new Employee("Lee", 5, 60000000);

        for (int i = 0; i < 5; i++) {
            System.out.println(employees[i].getName() + "=" + getSalaryIncrease(employees[i]));

        }

    }
}
