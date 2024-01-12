package c.inner.practice;

/**
 * @author hazel
 */
public class MyPage {

    InputBox input;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI() {
        input = new InputBox();

        KeyEventListener listener = new KeyEventListener() {//익명 클래스
            @Override
            public void onKeyDown() {
                System.out.println("Key down");

            }

            @Override
            public void onKeyUp() {
                System.out.println("Key up");
            }
        };

        input.setKeyListener(listener);

    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);


    }
}
