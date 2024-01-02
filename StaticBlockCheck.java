/**
 * @author hazel
 */
public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck staticBlockCheck = new StaticBlockCheck();
        //staticBlockCheck.makeStaticBlockObject();
        staticBlockCheck.makeStaticBlockObjectWithData();

    }

    public void makeStaticBlockObject() {
        System.out.println("Creating Block1");
        StaticBlock staticBlock1 = new StaticBlock();
        System.out.println("Created Block1");
        System.out.println("Creating Block2");
        StaticBlock staticBlock2 = new StaticBlock();
        System.out.println("Created Block2");
        /*
          결과를 보면 static 블록은 두번 객체를 생성했음에도 처음 한번만 호출되었으며 생성자전에 호출되었다.
          즉, static 블록은 클래스를 초기화할때 꼭 수행되어야하는 작업이 있을때 사용한다.
         */

    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data = " + StaticBlock.getData());//static이니까 객체 생성 X, staticblock 먼저 출력
        System.out.println("------------");
        StaticBlock block1 = new StaticBlock(); //여기서 생성자가 호출, staticblock은 사용했으니 제외
        block1.data = 1; //5-> 1
        System.out.println("=================");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2; // 1-> 2
        System.out.println("data = " + StaticBlock.getData());


    }
}
