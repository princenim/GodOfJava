package d.string.practice.lang.practice;

/**
 * @author hazel
 */
public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        //numberObjects.parseLong("r1024");
        numberObjects.printOtherBase(1024);


    }

    public long parseLong(String data) {
        try {
            long longData = Long.parseLong(data);
            System.out.println(longData);
            return longData;
        } catch (NumberFormatException e) {

            System.out.println(data + "is not a number");
            return -1;
        }


    }

    public void printOtherBase(long value) {
        System.out.println("original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value)); //2진수
        System.out.println("Hex : " + Long.toHexString(value)); //8진수
        System.out.println("Octal : " + Long.toOctalString(value)); //16진수


    }

}
