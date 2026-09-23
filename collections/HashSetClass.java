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
            if(set.contains(num)){
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
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : a) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection of Arrays: "+intersection);


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
        String str = sc.nextLine().toLowerCase();
        String[] s = str.split("\\s+");
        HashSet<String> strSet = new HashSet<>(Arrays.asList(s));
        System.out.println("Unique words in a String are : "+strSet.size());

        System.out.println("8. Find missing numbers from 1 to N.");
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 4, 6, 7, 9, 1, 12, 13};
        set = new HashSet<>(Arrays.asList(arr1));
        int n = 15;
        System.out.print("Not Present Elements are : ");
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }

        System.out.println("9. Remove duplicate characters from a string.");
        str = sc.nextLine().toLowerCase();
        HashSet<Character> charSet = new HashSet<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            charSet.add(c);
        }
        System.out.println("String After Removing Repeated Characters : "+charSet);

        System.out.println("10. Find distinct vowels in a string.");
        charSet = new HashSet<>();
        for (char c : ch){
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                charSet.add(c);
            }
        }
        System.out.println("Different Vowels in the String are : "+charSet);
    }
}
