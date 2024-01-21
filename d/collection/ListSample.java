package d.collection;

import java.util.ArrayList;

/**
 * @author hazel
 */
public class ListSample {
    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        //listSample.checkArrayList4();
        //listSample.checkArrayList6();
        //listSample.checkArrayList7();
        listSample.test();

    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;
        list.add("Ooops");
        for (String tmpData : list2) {
            System.out.println(tmpData);
        }
    }

    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);


    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String[] tmpArray = new String[2]; //크기가 3인 String 타입의 배열 생성
        String[] strList = list.toArray(tmpArray);
        for (String tmp : strList) {
            System.out.println(tmp);
        }


    }

    public void test() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.set(1, "D")); //set을 사용하면 해당 위치의 데이터를 리턴


    }


}
