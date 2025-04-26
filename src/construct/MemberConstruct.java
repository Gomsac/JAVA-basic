package construct;

/**
 * packageName    : construct
 * fileName       : MemberConstruct
 * author         : leeBro
 * date           : 2025-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-04-26        leeBro       최초 생성
 */

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age,50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age = " + age + " grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
