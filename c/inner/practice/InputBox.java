package c.inner.practice;

/**
 * @author hazel
 */
public class InputBox {

    public static final int KEY_DOWN = 2; //상수
    public static final int KEY_UP = 4;
    KeyEventListener listener;//중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스 - 코드의 가독성을 위함

    public InputBox() { //생성자

    }

    public void setKeyListener(KeyEventListener listener) {
        this.listener = listener;
    }

    public void listenerCalled(int eventType) {
        if (eventType == KEY_DOWN) {
            listener.onKeyDown();
        } else if (eventType == KEY_UP) {
            listener.onKeyUp();
        }

    }


}
