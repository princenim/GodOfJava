/**
 * @author hazel
 */
public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();
        controlWhile.whileContinueInfinit();

    }
    public void whileContinueInfinit(){
        int loop =0;
        while(loop <12){
            if(loop ==6){
                continue;
            }
            loop++;
            System.out.println(loop); //무한루프 6에서 countinue문으로 다시 루프로 돌아가 다시 6을 실행하기 때문에

        }


    }

}
