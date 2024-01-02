/**
 * @author hazel
 */
public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Class No:" + i);
            //manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }
    }

    int[][] gradeHeights;

    public void setData() {
        gradeHeights = new int[][]{ //초기화
                {170, 180, 173, 175, 177},
                {160, 165, 167, 185},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172},
        };
    }

    public void printHeight(int classNo) {
        //반 번호를 매개변수로 넘겨주면 키를 출력

        for (int data : gradeHeights[classNo - 1]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0;

        for (int data : gradeHeights[classNo - 1]) {
            sum += data;
        }
        double average = sum / gradeHeights[classNo-1].length;
        System.out.println(average);

    }
}
