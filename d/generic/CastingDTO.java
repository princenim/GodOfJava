package d.generic;

import java.io.Serializable;

/**
 * @author hazel
 */
public class CastingDTO implements Serializable { //구현
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
