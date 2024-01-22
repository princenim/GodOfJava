package d.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author hazel
 */
public class MapSample {
    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
        mapSample.checkHashMapEntry();


    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("B-", "c");

        Set<Map.Entry<String, String>> entries = map.entrySet(); //set안에 Entry 타입으로 리턴-하나의 키와 값만이 저장
        for (Map.Entry<String, String> tmpEntry : entries) {
            System.out.println(tmpEntry.getKey() + "= " + tmpEntry.getValue());
        }


    }
}
