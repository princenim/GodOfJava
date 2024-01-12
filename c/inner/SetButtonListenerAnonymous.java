package c.inner;

/**
 * @author hazel
 */
public class SetButtonListenerAnonymous {
    public static void main(String[] args) {
        MagicButton button = new MagicButton(); //인스턴스 생성
        button.setListener(new EventListener() { //익명 클래스
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked");
            }
        });

        button.onClickProcess();
    }


}
