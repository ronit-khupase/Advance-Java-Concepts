package collections;

import core.PracticeModule;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetPractice implements PracticeModule {

    private final Scanner sc = new Scanner(System.in);

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
    }

    private void q1() {

        System.out.println(
                "Q1. Remove duplicates while preserving insertion order."
        );

        int[] arr = {10, 10, 20, 30, 40, 40, 30};

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

    private void q2() {

        System.out.println(
                "Q2. Find first non-repeating integer."
        );

        int[] arr = {10, 20, 10, 30, 20, 40};

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        if (!set.isEmpty()) {
            System.out.println(
                    "First Non-Repeating : "
                            + set.iterator().next()
            );
        }
    }

    private void q3() {

        System.out.println(
                "Q3. Create ordered unique word list."
        );

        System.out.print("Enter Sentence : ");

        String input = sc.nextLine();

        String[] words =
                input.split("\\s+");

        LinkedHashSet<String> set =
                new LinkedHashSet<>();

        Collections.addAll(set, words);

        System.out.println(set);
    }

    private void q4() {

        System.out.println(
                "Q4. Remove repeated names from class list."
        );

        String[] names = {
                "Ronit",
                "Shubham",
                "Kartik",
                "Ronit",
                "Shubham"
        };

        LinkedHashSet<String> set =
                new LinkedHashSet<>();

        Collections.addAll(set, names);

        System.out.println(set);
    }

    private void q5() {

        System.out.println(
                "Q5. Merge two lists preserving order."
        );

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9};

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>();

        Collections.addAll(set, arr1);
        Collections.addAll(set, arr2);

        System.out.println(set);
    }

    private void q6() {

        System.out.println(
                "Q6. Browser history without duplicates."
        );

        LinkedHashSet<String> history =
                new LinkedHashSet<>();

        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        history.add("google.com");
        history.add("chatgpt.com");

        System.out.println(history);
    }

    private void q7() {

        System.out.println(
                "Q7. Find unique elements in original order."
        );

        int[] arr = {
                10, 10, 20, 30, 40, 40, 30
        };

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

    private void q8() {

        System.out.println(
                "Q8. Check if two lists contain same unique elements."
        );

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {5, 4, 3, 2, 1};

        LinkedHashSet<Integer> set1 =
                new LinkedHashSet<>();

        LinkedHashSet<Integer> set2 =
                new LinkedHashSet<>();

        Collections.addAll(set1, arr1);
        Collections.addAll(set2, arr2);

        System.out.println(
                set1.equals(set2)
                        ? "Same Elements"
                        : "Different Elements"
        );
    }

    private void q9() {

        System.out.println(
                "Q9. Recent Search History Feature."
        );

        LinkedHashSet<String> searchHistory =
                new LinkedHashSet<>();

        addSearch(searchHistory, "Java");
        addSearch(searchHistory, "Spring Boot");
        addSearch(searchHistory, "PostgreSQL");
        addSearch(searchHistory, "Java");

        System.out.println(searchHistory);
    }

    private void addSearch(
            LinkedHashSet<String> history,
            String search) {

        history.remove(search);
        history.add(search);
    }
}