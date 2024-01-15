package d.generic;

import java.io.Serializable;

/**
 * @author hazel
 */
public class CastingGenericDTO<T> implements Serializable { //Casrting을 제네릭으로 변경
    public T object;

    public T getObject() {
        return object;
    }

    public void setObject(T obj) {
        this.object = obj;
    }

}
