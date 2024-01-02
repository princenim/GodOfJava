/**
 * @author hazel
 */
public class PrintTimesTable {
    public static void main(String[] args) {
        PrintTimesTable printTimesTable = new PrintTimesTable();
        printTimesTable.printTimesSkipAfter4case3();
    }

    public void printTimesSkipAfter4case1() {
        for (int level = 2; level < 10; level++) {
            for (int unit = 1; unit < 10; unit++) {

                if (unit == 4) { //현재 실행중인 중괄호를 빠져나감
                    break;
                }
                System.out.print(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }


    }

    public void printTimesSkipAfter4case2() {
        for (int level = 2; level < 10; level++) {
            for (int unit = 1; unit < 10; unit++) {

                if (unit == 4) { //밑의코드를 실행하지 않고 바로 괄호의 boolean 조건문으로 이동
                    continue;
                }
                System.out.print(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }

    }

    //라벨
    public void printTimesSkipAfter4case3() {
        startLabel:
        for (int level = 2; level < 10; level++) {
            for (int unit = 1; unit < 10; unit++) {
                if (unit == 4) { //밑의코드를 실행하지 않고 바로 괄호의 boolean 조건문으로 이동
                    continue startLabel; //해당 라벨을 만나면 라벨을 지정한 부분으로 올라감
                }
                System.out.print(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }

    }
}
