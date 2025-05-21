import java.util.*;
import java.util.stream.*;

public class StudentFilterApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Alice", 92.5),
            new Student(2, "Bob", 67.0),
            new Student(3, "Charlie", 82.0),
            new Student(4, "David", 45.0),
            new Student(5, "Eva", 76.5)
        );

        System.out.println("🎓 All Students:");
        students.forEach(System.out::println);

        System.out.println("\n✅ Students with grade > 75 (Passed with Distinction):");
        students.stream()
            .filter(s -> s.getGrade() > 75)
            .sorted(Comparator.comparing(Student::getGrade).reversed())
            .forEach(System.out::println);

        System.out.println("\n🔍 First student with grade < 50 (Needs Improvement):");
        Optional<Student> lowPerformer = students.stream()
            .filter(s -> s.getGrade() < 50)
            .findFirst();

        System.out.println(lowPerformer.orElse(new Student(0, "No such student", 0.0)));
    }
}
