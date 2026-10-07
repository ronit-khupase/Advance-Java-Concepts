package collections;

import core.PracticeModule;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapPractice implements PracticeModule {

    private static final String TEXT =
            "Hello this is the String! Hello there how are you?";

    @Override
    public void run() {
        solutions();
    }

    public void solutions() {

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
    }

    private void q1() {

        System.out.println(
                "Q1. Store students sorted by roll number."
        );

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(1, "Ronit");
        students.put(4, "Kartik");
        students.put(3, "Shubham");
        students.put(2, "Abhi");

        System.out.println(students);
    }

    private void q2() {

        System.out.println(
                "Q2. Store products sorted by price."
        );

        TreeMap<Double, String> products =
                new TreeMap<>();

        products.put(999.99, "Keyboard");
        products.put(49999.99, "Laptop");
        products.put(599.99, "Mouse");

        for (Map.Entry<Double, String> entry
                : products.entrySet()) {

            System.out.println(
                    entry.getValue()
                            + " : ₹"
                            + entry.getKey());
        }
    }

    private void q3() {

        System.out.println(
                "Q3. Find highest and lowest key."
        );

        TreeMap<Integer, String> students =
                getStudents();

        System.out.println(
                "Highest Key : "
                        + students.lastKey());

        System.out.println(
                "Lowest Key : "
                        + students.firstKey());
    }

    private void q4() {

        System.out.println(
                "Q4. Find keys within range."
        );

        TreeMap<Integer, String> students =
                getStudents();

        NavigableMap<Integer, String> range =
                students.subMap(
                        1,
                        false,
                        4,
                        true);

        System.out.println(range);
    }

    private void q5() {

        System.out.println(
                "Q5. Print map in descending order."
        );

        TreeMap<Integer, String> students =
                getStudents();

        System.out.println(
                students.descendingMap());
    }

    private void q6() {

        System.out.println(
                "Q6. Grade Management System."
        );

        TreeMap<String, Character> grades =
                new TreeMap<>();

        grades.put("Ronit", 'A');
        grades.put("Shubham", 'B');
        grades.put("Amit", 'A');
        grades.put("Priya", 'C');

        for (Map.Entry<String, Character> entry
                : grades.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());
        }
    }

    private void q7() {

        System.out.println(
                "Q7. Rank List Using Marks."
        );

        TreeMap<Integer, String> rankList =
                new TreeMap<>(
                        Collections.reverseOrder());

        rankList.put(95, "Amit");
        rankList.put(92, "Ronit");
        rankList.put(88, "Shubham");
        rankList.put(85, "Priya");

        int rank = 1;

        for (Map.Entry<Integer, String> entry
                : rankList.entrySet()) {

            System.out.println(
                    "Rank "
                            + rank++
                            + " : "
                            + entry.getValue()
                            + " -> "
                            + entry.getKey());
        }
    }

    private void q8() {

        System.out.println(
                "Q8. Word Frequency Sorted Alphabetically."
        );

        TreeMap<String, Integer> frequency =
                new TreeMap<>();

        String[] words =
                TEXT.toLowerCase().split("\\s+");

        for (String word : words) {

            frequency.put(
                    word,
                    frequency.getOrDefault(word, 0)
                            + 1);
        }

        System.out.println(frequency);
    }

    private void q9() {

        System.out.println(
                "Q9. Employee Salary Report."
        );

        TreeMap<Double, String> employees =
                new TreeMap<>();

        employees.put(75000.0, "Ronit");
        employees.put(50000.0, "Amit");
        employees.put(90000.0, "Shubham");
        employees.put(65000.0, "Priya");

        for (Map.Entry<Double, String> entry
                : employees.entrySet()) {

            System.out.println(
                    entry.getValue()
                            + " -> ₹"
                            + entry.getKey());
        }
    }

    private void q10() {

        System.out.println(
                "Q10. floorKey() and ceilingKey()."
        );

        TreeMap<Integer, String> students =
                getStudents();

        int key = 2;

        System.out.println(
                "Floor Key : "
                        + students.floorKey(key));

        System.out.println(
                "Ceiling Key : "
                        + students.ceilingKey(key));
    }

    private TreeMap<Integer, String> getStudents() {

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(1, "Ronit");
        students.put(4, "Kartik");
        students.put(3, "Shubham");
        students.put(2, "Abhi");

        return students;
    }
}