package d.generic;

/**
 * @author hazel
 */
public class WildCardGeneric<W> { //제네릭 클래스
    W wildcard; //타입을 모름

    public W getWildcard() {
        return wildcard;

    }

    public void setWildcard(W wildcard) {
        this.wildcard = wildcard;
    }

}
