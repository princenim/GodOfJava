package d.collection.practice;

import java.util.ArrayList;

/**
 * @author hazel
 */
public class ManageHeight {

    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();

        for (int i = 1; i <= 5; i++) {
            //manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }


    }

    public void setData() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(170);
        list1.add(180);
        list1.add(173);
        list1.add(175);
        list1.add(177);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(160);
        list2.add(165);
        list2.add(167);
        list2.add(186);


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(158);
        list3.add(177);
        list3.add(187);
        list3.add(176);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(170);
        list4.add(180);
        list4.add(165);
        list4.add(177);
        list4.add(172);

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(170);
        list5.add(180);
        list5.add(165);
        list5.add(177);
        list5.add(172);


        gradeHeights.add(list1);
        gradeHeights.add(list2);
        gradeHeights.add(list3);
        gradeHeights.add(list4);
        gradeHeights.add(list5);
    }

    //반 번호를 넘겨주면 해당 반 학생들의 키를 번호 순대로 출력
    public void printHeight(int classNo) {
        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
        System.out.println("Class No : " + classNo);
        for (int tmpHeight : classHeight) {
            System.out.println(tmpHeight);
        }
    }

    public void printAverage(int classNo) {

        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
        System.out.println("Class No : " + classNo);

        double sum = 0;
        for (int tmpHeight : classHeight) {
            sum += tmpHeight;
        }

        double average = sum / classHeight.size();
        System.out.println("Height average : " + average);

    }

}
