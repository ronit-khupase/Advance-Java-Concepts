package collections;

import java.util.*;

public class HashSetClass {

    Scanner sc = new Scanner(System.in);

    public void solutions(){
        System.out.println("1. Remove duplicates from an array using HashSet.");
        int[] arr = {10,20,10,30,20,10,40};
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        System.out.println("Array After Removing Duplicates : "+set);

//
//        2. Check if two arrays have common elements.
//        3. Find union of two arrays.
//        4. Find intersection of two arrays.
//        5. Find first duplicate element.
//        6. Check if array contains duplicate values.
//        7. Count unique words in a sentence.
//        8. Find missing numbers from 1 to N.
//        9. Remove duplicate characters from a string.
//        10. Find distinct vowels in a string.
    }
}
