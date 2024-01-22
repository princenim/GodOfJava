package d.collection;

import java.util.Properties;

/**
 * @author hazel
 */
public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample propertiesSample = new PropertiesSample();
        propertiesSample.checkProperties();

    }

    public void checkProperties() {
        Properties prop = System.getProperties();
        for (Object tmpObj : prop.keySet()) {
            System.out.println(tmpObj + "=" + prop.get(tmpObj));
        }

    }
}
