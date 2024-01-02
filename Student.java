/**
 * @author hazel
 */
public class Student {
    String name;
    String address;
    String phone;
    String email;

    //생성자
    Student(String name){
        this.name = name;
    }

    Student(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return name+" "+address+" "+phone+" "+email;
    }
}
