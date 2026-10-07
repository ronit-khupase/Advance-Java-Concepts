package collections;

import core.PracticeModule;

import java.util.*;

public class HashSetPractice implements PracticeModule {

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
        q10();
    }

    private void q1() {

        System.out.println("Q1. Remove duplicates from array.");

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

    private void q2() {

        System.out.println("Q2. Check common elements.");

        int[] arr1 = {10, 20, 10, 30, 20, 10, 40};
        int[] arr2 = {15, 25, 10, 30, 20, 10, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        boolean common = false;

        for (int num : arr2) {

            if (set.contains(num)) {
                common = true;
                break;
            }
        }

        System.out.println(
                common
                        ? "Common Elements Present"
                        : "No Common Elements Present"
        );
    }

    private void q3() {

        System.out.println("Q3. Union of arrays.");

        int[] arr1 = {10, 20, 10, 30, 20, 10, 40};
        int[] arr2 = {15, 25, 10, 30, 20, 10, 40};

        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) {
            union.add(num);
        }

        for (int num : arr2) {
            union.add(num);
        }

        System.out.println(union);
    }

    private void q4() {

        System.out.println("Q4. Intersection of arrays.");

        int[] arr1 = {10, 20, 10, 30, 20, 10, 40};
        int[] arr2 = {15, 25, 10, 30, 20, 10, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        HashSet<Integer> intersection =
                new HashSet<>();

        for (int num : arr2) {

            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println(intersection);
    }

    private void q5() {

        System.out.println("Q5. First duplicate element.");

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (!set.add(num)) {

                System.out.println(num);
                return;
            }
        }

        System.out.println("No Duplicates");
    }

    private void q6() {

        System.out.println("Q6. Check duplicates.");

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(
                arr.length != set.size()
                        ? "Duplicates Present"
                        : "No Duplicates"
        );
    }

    private void q7() {

        System.out.println("Q7. Count unique words.");

        System.out.print("Enter Sentence : ");

        String sentence = sc.nextLine().toLowerCase();

        String[] words =
                sentence.split("\\s+");

        HashSet<String> set =
                new HashSet<>(Arrays.asList(words));

        System.out.println(
                "Unique Words : " + set.size()
        );
    }

    private void q8() {

        System.out.println("Q8. Missing numbers from 1 to N.");

        Integer[] arr =
                {1, 2, 3, 4, 4, 6, 7, 9, 1, 12, 13};

        HashSet<Integer> set =
                new HashSet<>(Arrays.asList(arr));

        int n = 15;

        System.out.print("Missing : ");

        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    private void q9() {

        System.out.println("Q9. Remove duplicate characters.");

        System.out.print("Enter String : ");

        String str = sc.nextLine();

        LinkedHashSet<Character> set =
                new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result =
                new StringBuilder();

        for (char ch : set) {
            result.append(ch);
        }

        System.out.println(result);
    }

    private void q10() {

        System.out.println("Q10. Distinct vowels.");

        System.out.print("Enter String : ");

        String str =
                sc.nextLine().toLowerCase();

        HashSet<Character> vowels =
                new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (ch == 'a'
                    || ch == 'e'
                    || ch == 'i'
                    || ch == 'o'
                    || ch == 'u') {

                vowels.add(ch);
            }
        }

        System.out.println(vowels);
    }
}