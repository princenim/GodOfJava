package d.generic;

/**
 * @author hazel
 */
public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcardMethod();

        sample.callGenericdMethod();

    }

    public void boundedWildcardMethod(WildCardGeneric<? extends Car> c) {//매개변수에는 다른 타입이 올수없음. Car을 상속받은 클래스만 사용할수있음.
        Car value = c.getWildcard();
        System.out.println(value);
    }


    public void callBoundedWildcardMethod() {
        WildCardGeneric<Car> wildcard = new WildCardGeneric<Car>();//제네릭타입 객체 생성
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);

    }

    public void callBusBoundedWildcardMethod() {
        WildCardGeneric<Bus> wildcard = new WildCardGeneric<>();
        wildcard.setWildcard(new Bus("6666"));
        boundedWildcardMethod(wildcard);
    }

    public <T> void genericMethod(WildCardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericdMethod() {
        WildCardGeneric<String> wildcard = new WildCardGeneric<>();
        genericMethod(wildcard, "Data");


    }
}
