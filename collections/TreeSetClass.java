package collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public void solutions(){
        System.out.println("1. Store numbers in sorted order.");
        TreeSet<Integer> set = new TreeSet<>();
        Integer[] arr = new Integer[]{10,20,30,40,10,20,15};
        Collections.addAll(set,arr);
        System.out.println("Sorted order: "+set);

        System.out.println("2. Find smallest and largest element.");
        int smallest = set.first();
        int largest = set.last();
        System.out.println("Smallest :"+ smallest+" Largest : "+largest);

        System.out.println(" 3. Find elements greater than a given value.");
        int given = 20;
        int greater = set.higher(given);
        System.out.println("Element greater than 20 is : "+greater);

        System.out.println(" 4. Find elements less than a given value.");
        int smaller = set.floor(given);
        System.out.println("Element Smaller Than 20 is : "+smaller);

        System.out.println("5. Find ceiling and floor of a number.");
        System.out.println("Same as Q3 and Q4");

        System.out.println("6. Remove duplicates and sort an array.");
        System.out.println("Same as Q1");

        System.out.println("7. Find nearest value to a target.");
        int nearest = (given-smaller) < (greater-given) ? smaller : greater;
        System.out.println("Nearest Value is : "+nearest);

        System.out.println("8. Print elements in descending order.");
        System.out.println("Descending Order : "+ set.descendingSet());

        System.out.println("9. Create a leaderboard ranking system.");
        TreeSet<Integer> leader = new TreeSet<>();
        leader.add(50);
        leader.add(70);
        leader.add(80);
        leader.add(90);
        leader.add(20);
        System.out.println("LeaderBoard : "+leader);

        System.out.println("10. Store student marks and print them sorted.");
        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(80);
        marks.add(40);
        marks.add(60);
        marks.add(90);
        marks.add(20);
        System.out.println("LeaderBoard : "+marks);

    }
}
