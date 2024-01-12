package c.inner;

/**
 * @author hazel
 */
public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        //MagicButtonListener listener = new MagicButtonListener;
        //button.setListener(listener);
        button.onClickProcess();

    }

//    class MagicButtonListener implements EventListener {
//
//
//        @Override
//        public void onClick() {
//            System.out.println("Magin Button Clicked!!");
//
//        }
//    }
}
