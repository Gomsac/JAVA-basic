package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] students = {"학생1", "학생2", "학생3", "학생4"};
        int[] ages = {16, 15, 17, 18};
        int[] grades = {98, 80, 90, 94};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
        }

    }
}
