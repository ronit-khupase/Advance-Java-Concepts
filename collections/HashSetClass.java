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

        System.out.println("2. Check if two arrays have common elements.");
        int[] a = {15,25,10,30,20,10,40};
        set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        boolean common = false;
        for (int num : a){
            if(set.remove(num)){
                common = true;
                break;
            }
        }
        if(common){
            System.out.println("Common Elements Present!");
        }else {
            System.out.println("No Common Elements Present!");
        }

        System.out.println("3. Find union of two arrays.");
        set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        for (int num : a){
            set.add(num);
        }
        System.out.println("Union of 2 arrays : "+set);


        System.out.println("4. Find intersection of two arrays.");
        set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : a){
            if(set.contains(num)){
                list.add(num);
            }
        }
        System.out.println("Intersection of Arrays: "+list);


        System.out.println("5. Find first duplicate element.");
        set = new HashSet<>();
        for (int num : arr){
            if(!set.add(num)){
                System.out.println("First Duplicate is : "+num);
                break;
            }
        }

        System.out.println("6. Check if array contains duplicate values.");
        set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        if(arr.length != set.size()){
            System.out.println("Array Contains Duplicate Elements!");
        }else {
            System.out.println("Array Not Contains Duplicates!");
        }

        System.out.println("7. Count unique words in a sentence.");


//        8. Find missing numbers from 1 to N.
//        9. Remove duplicate characters from a string.
//        10. Find distinct vowels in a string.
    }
}
