package c.inheritance;

/**
 * @author hazel
 */
public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritanceCasting = new InheritanceCasting();
        //inheritanceCasting.objectCast();
        inheritanceCasting.objectCastArray();
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting(); //초기화
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();

        //objectTypeCheck(parentArray);
        objectTypeCheck2(parentArray);
    }

    public void test() {
        ChildCasting childCasting = new ChildCasting();
        ParentCasting parentCasting = new ParentCasting();

        parentCasting = childCasting;
        childCasting.printAge();

    }


    public void objectTypeCheck(ParentCasting[] parentArray) {
        for (ParentCasting tmpParent : parentArray) {
            if (tmpParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ((ChildCasting) tmpParent).printAge(); //ChildCasting의 printAge메소드 , ParentCasting에서 ChildCasting으로 형변환
            } else if (tmpParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }


    //잘못된 예 -> 이렇게하면  ParentCasting다 포함되기 때문에 하위에 있는 자식타입부터 확인해야함.
    public void objectTypeCheck2(ParentCasting[] parentArray) {
        for (ParentCasting tmpParent : parentArray) {
            if (tmpParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            } else if (tmpParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ((ChildCasting) tmpParent).printAge();
            }
        }
    }

    public void objectCast() {

        //ChildCasting이 ParentCasting를 상속받음.
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        //자식 -> 부모
        ParentCasting parent2 = child; //자식에서 부모로 형변환은 문제없음.

        //부모 -> 자식
        //ChildCasting child2 = parent; //X -> 컴파일 에러 따라서 명시적 변환을 해야함
        ChildCasting child2 = (ChildCasting) parent;
        //컴파일은 되나 실행에서 오류남

    }

    //명시적 형변환이 가능한 경우
    public void objectClass2() {
        ChildCasting child = new ChildCasting(); //객체 생성
        ParentCasting parent2 = child; //child 인스턴스를 ParentCasting이라는 클래스 타입에 대입
        //parent2 의 모습은 ParentCasting처럼 보이지만 실제로 ChildCasting 클래스의 객체이다 왜냐면 child를 대입했기 때문에
        ChildCasting child2 = (ChildCasting) parent2; //따라서 명시적형변환을 해도 parent2는 실제로 childCasting 객체이기때문에  형 변환해도 전혀 문제 없음.
    }
}
