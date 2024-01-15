package d.generic;

/**
 * @author hazel
 */
public class WildCardSample {
    public static void main(String[] args) {
        WildCardSample wildCardSample = new WildCardSample();
        wildCardSample.callWildcardMethod();

    }

    public void callWildcardMethod() {
        WildCardGeneric<String> wildCard = new WildCardGeneric<String>(); //WildCardGeneric 클래스 객체 생성
        wildCard.setWildcard("A");
        wildcardStringMethod(wildCard);
    }


    public void wildcardStringMethod(WildCardGeneric<?> c) { //타입을 지정하지 않고 ? 로 지정 - wildcard 라고 부름.
        //와일드 카드는 매개변수로만 사용하는 것이 좋다.
        Object value = c.getWildcard();// 해당 매개변수 출력
        if (value instanceof String) {
            System.out.println(value);

        }
    }
}
