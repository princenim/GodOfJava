package e.io.object;

import java.io.Serializable;

/**
 * @author hazel
 */

public class SerialDTO implements Serializable { //객체를 저장하거나 다른 JVM으로 보낼떄 사용

    static final long serialVersionUID = 1L; //이렇게 ID를 명시하면 저장했을 때 변수가 변경되더라고 예외는 발생하지 않는다. 하지만 운영상황에서 데이터가 꼬일수 있으니 값을 변경하는 습괍을 가져야한다.

    private String bookName;
    transient private int bookOrder; //transient을 사용하면 객체를 저장하거나 다른 JVM으로 보낼때 제외
    private boolean bestSeller;
    private long soldPerDay;

    private String bookTypes = "IT";

    //생성자
    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {

        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;

    }


    @Override
    public String toString() {
        return "SerialDTO [bookName= " + bookName + ", bookOrder" + "=" + bookOrder + ", bestSeller=" + bestSeller + ", soldPerDay= " + soldPerDay + ",bookTypes=" + bookTypes + "]";
    }

}
