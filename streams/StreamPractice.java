package streams;

import core.PracticeModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice implements PracticeModule {

    @Override
    public void run() {
        solutions();
    }

    public void solutions() {

        q1To5();
        q6To8();
        q9To13();
        q14To17();
        q18To25();
    }

    private void q1To5() {

        List<Integer> nums =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Q1. Print all numbers using Stream.");
        nums.stream().forEach(System.out::println);

        System.out.println("Q2. Print only even numbers.");
        nums.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Q3. Print only odd numbers.");
        nums.stream()
                .filter(x -> x % 2 != 0)
                .forEach(System.out::println);

        System.out.println("Q4. Count total even numbers.");
        long count = nums.stream()
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println("Count : " + count);

        System.out.println("Q5. Print first 5 numbers.");
        nums.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    private void q6To8() {

        List<Integer> nums =
                Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Q6. Print square of every number.");
        nums.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        System.out.println("Q7. Print cube of every number.");
        nums.stream()
                .map(x -> x * x * x)
                .forEach(System.out::println);

        System.out.println("Q8. Create List of squares.");

        List<Integer> squares = nums.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(squares);
    }

    private void q9To13() {

        List<String> names =
                Arrays.asList(
                        "Ronit",
                        "Amit",
                        "Priya",
                        "Rahul",
                        "Ronit"
                );

        System.out.println("Q9. Uppercase Names");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("Q10. Remove Duplicates");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Q11. Names Length >= 5");
        names.stream()
                .filter(name -> name.length() >= 5)
                .forEach(System.out::println);

        System.out.println("Q12. Count Names Length >= 5");

        long count = names.stream()
                .filter(name -> name.length() >= 5)
                .count();

        System.out.println(count);

        System.out.println("Q13. Names Starting With R");

        names.stream()
                .filter(name ->
                        Character.toLowerCase(name.charAt(0)) == 'r')
                .forEach(System.out::println);
    }

    private void q14To17() {

        List<Integer> nums =
                Arrays.asList(5, 2, 8, 1, 9, 3);

        System.out.println("Q14. Ascending Sort");
        nums.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Q15. Descending Sort");
        nums.stream()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);

        System.out.println("Q16. Maximum");

        int max = nums.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println(max);

        System.out.println("Q17. Minimum");

        int min = nums.stream()
                .min(Integer::compareTo)
                .orElseThrow();

        System.out.println(min);
    }

    private void q18To25() {

        List<StreamStudent> students = getStudents();

        System.out.println("Q18. CGPA > 9");

        students.stream()
                .filter(student -> student.cgpa > 9)
                .forEach(student ->
                        System.out.println(student.name));

        System.out.println("Q19. Student Names");

        students.stream()
                .map(student -> student.name)
                .forEach(System.out::println);

        System.out.println("Q20. Highest CGPA");

        double maxCgpa = students.stream()
                .map(student -> student.cgpa)
                .max(Double::compareTo)
                .orElseThrow();

        System.out.println(maxCgpa);

        System.out.println("Q21. Count CGPA > 8");

        long count = students.stream()
                .filter(student -> student.cgpa > 8)
                .count();

        System.out.println(count);

        System.out.println("Q22. Uppercase Names");

        students.stream()
                .map(student ->
                        student.name.toUpperCase())
                .forEach(System.out::println);

        System.out.println("Q23. Sort By CGPA Desc");

        students.stream()
                .sorted((a, b) ->
                        Double.compare(b.cgpa, a.cgpa))
                .forEach(System.out::println);

        System.out.println("Q24. Top 2 Students");

        students.stream()
                .sorted((a, b) ->
                        Double.compare(b.cgpa, a.cgpa))
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Q25. Names With CGPA > 8");

        List<String> result =
                students.stream()
                        .filter(student -> student.cgpa > 8)
                        .map(student -> student.name)
                        .toList();

        System.out.println(result);
    }

    private List<StreamStudent> getStudents() {

        List<StreamStudent> students = new ArrayList<>();

        students.add(new StreamStudent("Ronit", 9.81));
        students.add(new StreamStudent("Amit", 8.50));
        students.add(new StreamStudent("Priya", 9.20));
        students.add(new StreamStudent("Rahul", 7.80));

        return students;
    }
}

class StreamStudent {

    String name;
    double cgpa;

    StreamStudent(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return name + " - " + cgpa;
    }
}