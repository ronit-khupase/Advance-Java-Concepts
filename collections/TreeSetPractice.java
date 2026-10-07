package collections;

import core.PracticeModule;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetPractice implements PracticeModule {

    @Override
    public void run() {
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

    private final TreeSet<Integer> set =
            new TreeSet<>(java.util.Arrays.asList(10, 20, 30, 40, 10, 20, 15));

    private void q1() {
        System.out.println("\nQ1. Store numbers in sorted order");

        System.out.println("Sorted Order : " + set);
    }

    private void q2() {
        System.out.println("\nQ2. Find smallest and largest element");

        System.out.println("Smallest : " + set.first());
        System.out.println("Largest : " + set.last());
    }

    private void q3() {
        System.out.println("\nQ3. Find element greater than a given value");

        int given = 20;

        System.out.println("Given Value : " + given);
        System.out.println("Higher Value : " + set.higher(given));
    }

    private void q4() {
        System.out.println("\nQ4. Find element less than a given value");

        int given = 20;

        System.out.println("Given Value : " + given);
        System.out.println("Lower Value : " + set.lower(given));
    }

    private void q5() {
        System.out.println("\nQ5. Find ceiling and floor of a number");

        int target = 22;

        System.out.println("Target : " + target);
        System.out.println("Floor : " + set.floor(target));
        System.out.println("Ceiling : " + set.ceiling(target));
    }

    private void q6() {
        System.out.println("\nQ6. Remove duplicates and sort an array");

        Integer[] arr = {50, 10, 20, 10, 30, 20, 40};

        TreeSet<Integer> uniqueSorted = new TreeSet<>();
        Collections.addAll(uniqueSorted, arr);

        System.out.println("Result : " + uniqueSorted);
    }

    private void q7() {
        System.out.println("\nQ7. Find nearest value to a target");

        int target = 22;

        Integer floor = set.floor(target);
        Integer ceiling = set.ceiling(target);

        int nearest;

        if (floor == null) {
            nearest = ceiling;
        } else if (ceiling == null) {
            nearest = floor;
        } else {
            nearest =
                    (target - floor <= ceiling - target)
                            ? floor
                            : ceiling;
        }

        System.out.println("Target : " + target);
        System.out.println("Nearest Value : " + nearest);
    }

    private void q8() {
        System.out.println("\nQ8. Print elements in descending order");

        System.out.println("Descending Order : " + set.descendingSet());
    }

    private void q9() {
        System.out.println("\nQ9. Create a leaderboard ranking system");

        TreeSet<Integer> leaderboard =
                new TreeSet<>(Collections.reverseOrder());

        leaderboard.add(50);
        leaderboard.add(70);
        leaderboard.add(80);
        leaderboard.add(90);
        leaderboard.add(20);

        int rank = 1;

        for (int score : leaderboard) {
            System.out.println(
                    "Rank " + rank++
                            + " -> Score : "
                            + score
            );
        }
    }

    private void q10() {
        System.out.println("\nQ10. Store student marks and print them sorted");

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(80);
        marks.add(40);
        marks.add(60);
        marks.add(90);
        marks.add(20);

        System.out.println("Sorted Marks : " + marks);
    }
}