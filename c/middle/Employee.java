package c.middle;

/**
 * @author hazel
 */
public class Employee {
    private String name;
    private int type;
    private long salary; //해당 클래스 내에서만 접근 가능.

    public Employee(String name, int type, long salary) {  //생성자
        this.name = name;
        this.type = type;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


}


