package c.inner;

/**
 * @author hazel
 */
public class MagicButton {
    private c.inner.EventListener listener;

    public MagicButton() { //생성자

    }

    public void setListener(EventListener eventListener) {
        this.listener = eventListener;
    }

    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }


}
