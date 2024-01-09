package d.string.practice;

/**
 * @author hazel
 */
public class UseStringMethod {
    public static void main(String[] args) {
        String str = "The String class represents character strings";
        UseStringMethod useStringMethod = new UseStringMethod();
        useStringMethod.printWords(str);
        useStringMethod.findString(str, "string");
        useStringMethod.findAnyCastString(str, "string");
        useStringMethod.countChar(str, 's');
        useStringMethod.printCountWords(str, "ss");

    }

    public void printWords(String str) {
        String[] strArr = str.split(" ");
        for (String data : strArr) {
            System.out.println(data);
        }
    }

    public void findString(String str, String findStr) {
        int res = str.indexOf(findStr);
        System.out.println(res);
    }

    public void findAnyCastString(String str, String findStr) {
        int res = str.toLowerCase().indexOf(findStr);
        System.out.println(res);

    }

    public void countChar(String str, char c) {
        char[] charArray = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    public void printCountWords(String str, String findStr) {

        String[] words = str.split(" ");
        for (String data : words) {
            if (data.contains(findStr)) {
                System.out.println(data);
            }
        }
    }
}
