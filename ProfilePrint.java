/**
 * @author hazel
 */
public class ProfilePrint {


    byte age;
    String name;

    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();

        String name = "Hong";
        byte age = 20;
        boolean isMarried = false;

        profilePrint.setName(name);
        profilePrint.setAge(age);
        profilePrint.setMarried(isMarried);

        profilePrint.getName();
        profilePrint.getAge();
        profilePrint.isMarried();


    }


    //나이 설정
    public void setAge(byte age) {
        this.age = age;
    }

    //나이 리턴
    public void getAge() {
        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;

    }

    public void getName() {
        System.out.println(name);
    }


    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public void isMarried() {
        System.out.println(isMarried);
    }

}
