package collections;

import core.PracticeModule;

import java.util.*;

public class LinkedListPractice implements PracticeModule {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        solutions();
    }

    public void solutions() {

        q1();
        q2();
        q3();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
    }

    private void q1() {

        System.out.println("Q1. Insert node at beginning, middle, and end.");

        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(50);
        list.add(1, 20);
        list.addLast(30);

        System.out.println(list);
    }

    private void q2() {

        System.out.println("Q2. Reverse a LinkedList.");

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(50, 20, 30));

        LinkedList<Integer> reverse = new LinkedList<>();

        for (Integer num : list) {
            reverse.addFirst(num);
        }

        System.out.println(reverse);
    }

    private void q3() {

        System.out.println("Q3. Find middle node.");

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(50, 20, 30));

        System.out.println(
                list.get(list.size() / 2)
        );
    }

    private void q5() {

        System.out.println("Q5. Remove nth node from end.");

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if (n > 0 && n <= list.size()) {

            list.remove(list.size() - n);

        } else {

            System.out.println("Invalid Index");
        }

        System.out.println(list);
    }

    private void q6() {

        System.out.println("Q6. Find length of LinkedList.");

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(10, 20, 30));

        System.out.println(list.size());
    }

    private void q7() {

        System.out.println("Q7. Merge two sorted LinkedLists.");

        LinkedList<Integer> list1 =
                new LinkedList<>(Arrays.asList(10, 30, 50));

        LinkedList<Integer> list2 =
                new LinkedList<>(Arrays.asList(20, 40, 60, 80));

        LinkedList<Integer> merged =
                new LinkedList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() &&
                j < list2.size()) {

            if (list1.get(i) <= list2.get(j)) {

                merged.add(list1.get(i++));

            } else {

                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }

        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        System.out.println(merged);
    }

    private void q8() {

        System.out.println("Q8. Check palindrome.");

        LinkedList<Integer> list =
                new LinkedList<>(
                        Arrays.asList(
                                10, 20, 30, 20, 10
                        ));

        boolean palindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {

            if (!list.get(i)
                    .equals(list.get(
                            list.size() - i - 1))) {

                palindrome = false;
                break;
            }
        }

        System.out.println(
                palindrome
                        ? "Palindrome"
                        : "Not Palindrome"
        );
    }

    private void q9() {

        System.out.println("Q9. Remove duplicates.");

        LinkedList<Integer> list =
                new LinkedList<>(
                        Arrays.asList(
                                10, 20, 20, 30, 10
                        ));

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>(list);

        list.clear();
        list.addAll(set);

        System.out.println(list);
    }

    private void q10() {

        System.out.println(
                "Q10. Convert ArrayList and LinkedList."
        );

        LinkedList<Integer> linkedList =
                new LinkedList<>(
                        Arrays.asList(
                                10, 20, 30
                        ));

        List<Integer> arrayList =
                new ArrayList<>(linkedList);

        System.out.println(
                "LinkedList -> ArrayList : "
                        + arrayList
        );

        linkedList =
                new LinkedList<>(arrayList);

        System.out.println(
                "ArrayList -> LinkedList : "
                        + linkedList
        );
    }
}