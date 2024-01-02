/**
 * @author hazel
 */
public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch controlSwitch = new ControlSwitch();
        controlSwitch.switchStatement(1);
        controlSwitch.switchStatement(3);

        controlSwitch.switchStatement2(1);


    }

    public void switchStatement(int number) {
        switch (number) {
            case 1:
                System.out.println("1번");
                break; //case문을 마무리하고 싶으면 break
            case 2:
                System.out.println("2번");
                break;
            default: //앞에 있는 조건에 맞지 않는 경우 수행
                System.out.println("hihi");
        }

    }

    public void switchStatement2(int number) {
        switch (number) {
            case 1:
                System.out.println("1번");
                // break 문이 없다면 다음 break문이 올때까지 계속 실행
            case 2:
                System.out.println("2번");
                break;
            default: //앞에 있는 조건에 맞지 않는 경우 수행
                System.out.println("hihi");
        }

    }
}
