package stream;

/**
 * @author hazel
 */
public class StudentDTO {
    String name;
    int age;
    int scoreMath;
    int scoreEnglish;

    //생성자
    public StudentDTO(String name, int age, int scoreMath, int scoreEnglish) {
        this.name = name;
        this.age = age;
        this.scoreEnglish = scoreEnglish;
        this.scoreMath = scoreMath;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
    }

    public int getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(int scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }
}
