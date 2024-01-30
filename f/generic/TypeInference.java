package f.generic;

/**
 * @author hazel
 */
public class TypeInference {
    public static void main(String[] args) {

        TypeInference type = new TypeInference();
        //type.makeObject1();
        type.makeObject2();

    }

    public void makeObject1() {
        GenericClass<Integer> generic1 = new GenericClass<>("String");
        generic1.setValue(999);

    }

    public void makeObject2() {
        GenericClass<Integer> generic2 = new GenericClass("String");
        generic2.setValue(999);


    }
}
