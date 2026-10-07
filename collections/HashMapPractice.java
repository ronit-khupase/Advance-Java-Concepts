package collections;

import core.PracticeModule;

import java.util.*;

public class HashMapPractice implements PracticeModule {

    private static final String TEXT =
            "Hello there this is the string!";

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

        System.out.println("Q1. Count frequency of each character.");

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : TEXT.toLowerCase().toCharArray()) {

            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(map);
    }

    private void q2() {

        System.out.println("Q2. Count frequency of each word.");

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = TEXT.toLowerCase().split("\\s+");

        for (String word : words) {

            map.put(word,
                    map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }

    private void q3() {

        System.out.println("Q3. Find first non-repeating character.");

        HashMap<Character, Integer> map = new HashMap<>();

        String text = TEXT.toLowerCase();

        for (char ch : text.toCharArray()) {

            if (ch != ' ') {
                map.put(ch,
                        map.getOrDefault(ch, 0) + 1);
            }
        }

        for (char ch : text.toCharArray()) {

            if (ch != ' ' && map.get(ch) == 1) {

                System.out.println(
                        "First Non-Repeating Character : "
                                + ch);

                return;
            }
        }

        System.out.println("No Non-Repeating Character");
    }

    private void q4() {

        System.out.println("Q4. Find first repeating character.");

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : TEXT.toLowerCase().toCharArray()) {

            if (ch == ' ') {
                continue;
            }

            if (map.containsKey(ch)) {

                System.out.println(
                        "First Repeating Character : "
                                + ch);

                return;
            }

            map.put(ch, 1);
        }

        System.out.println("No Repeating Character");
    }

    private void q5() {

        System.out.println("Q5. Group students by department.");

        ArrayList<DepartmentStudent> students =
                new ArrayList<>();

        students.add(
                new DepartmentStudent("Ronit", "MCA"));
        students.add(
                new DepartmentStudent("Shubham", "MCA"));
        students.add(
                new DepartmentStudent("Kartik", "MSC"));
        students.add(
                new DepartmentStudent("Sarthak", "MSC"));
        students.add(
                new DepartmentStudent("Manisha", "MCA"));

        HashMap<String, List<String>> map =
                new HashMap<>();

        for (DepartmentStudent student : students) {

            map.putIfAbsent(
                    student.department,
                    new ArrayList<>());

            map.get(student.department)
                    .add(student.name);
        }

        System.out.println(map);
    }

    private void q6() {

        System.out.println("Q6. PhoneBook Application.");

        ArrayList<Contact> contacts =
                new ArrayList<>();

        contacts.add(
                new Contact("Ronit",
                        "7410859630"));

        contacts.add(
                new Contact("Shubham",
                        "1472583690"));

        contacts.add(
                new Contact("Kartik",
                        "7894561230"));

        contacts.add(
                new Contact("Abhishek",
                        "032654987"));

        contacts.add(
                new Contact("Ronit",
                        "7539511462"));

        HashMap<String, List<String>> map =
                new HashMap<>();

        for (Contact contact : contacts) {

            map.putIfAbsent(
                    contact.name,
                    new ArrayList<>());

            map.get(contact.name)
                    .add(contact.phoneNumber);
        }

        System.out.println(map);
    }

    private void q7() {

        System.out.println(
                "Q7. Find highest frequency character.");

        HashMap<Character, Integer> map =
                new HashMap<>();

        for (char ch : TEXT.toLowerCase().toCharArray()) {

            if (ch != ' ') {

                map.put(ch,
                        map.getOrDefault(ch, 0) + 1);
            }
        }

        char result = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry
                : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {

                maxFrequency = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(
                result + " -> " + maxFrequency);
    }

    private void q8() {

        System.out.println(
                "Q8. Count occurrences of array elements.");

        int[] arr =
                {10, 10, 20, 30, 40, 50, 50, 60};

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for (int num : arr) {

            map.put(num,
                    map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }

    private void q9() {

        System.out.println(
                "Q9. Check if two strings are anagrams.");

        String s1 = "race";
        String s2 = "cear";

        if (s1.length() != s2.length()) {

            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> map =
                new HashMap<>();

        for (char ch : s1.toLowerCase().toCharArray()) {

            map.put(ch,
                    map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toLowerCase().toCharArray()) {

            map.put(ch,
                    map.getOrDefault(ch, 0) - 1);
        }

        boolean anagram = true;

        for (int value : map.values()) {

            if (value != 0) {

                anagram = false;
                break;
            }
        }

        System.out.println(
                anagram ? "Anagram"
                        : "Not Anagram");
    }

    private void q10() {

        System.out.println(
                "Q10. Employee ID -> Employee Mapping");

        HashMap<Integer, EmployeeRecord> employees =
                new HashMap<>();

        employees.put(
                101,
                new EmployeeRecord(101, "Ronit"));

        employees.put(
                102,
                new EmployeeRecord(102, "Amit"));

        employees.put(
                103,
                new EmployeeRecord(103, "Priya"));

        System.out.println(employees);
    }
}

class DepartmentStudent {

    String name;
    String department;

    DepartmentStudent(String name,
                      String department) {

        this.name = name;
        this.department = department;
    }
}

class Contact {

    String name;
    String phoneNumber;

    Contact(String name,
            String phoneNumber) {

        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class EmployeeRecord {

    int id;
    String name;

    EmployeeRecord(int id,
                   String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Employee{id="
                + id
                + ", name='"
                + name
                + "'}";
    }
}