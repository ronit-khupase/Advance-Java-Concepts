package collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetClass {
    Scanner sc = new Scanner(System.in);

    public void solutions(){
        System.out.println("1. Remove duplicates while preserving insertion order.");
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int[] arr = {10,10,20,30,40,40,30};
        for (int i : arr){
            set.add(i);
        }
        System.out.println("Array After Removing Duplicates: "+set);

        System.out.println("2. Find first non-repeating integer.");
        set = new LinkedHashSet<>();
        for (int i : arr){
            if(set.contains(i)){
                set.remove(i);
            }
            else {
                set.add(i);
            }
        }
        System.out.println("First Non-Repeating is : "+ set.getFirst());

        System.out.println("3. Create ordered unique word list.");
        String str = sc.nextLine();
        String[] s = str.split("\\s+");
        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        Collections.addAll(strSet, s);
        System.out.println("Unique ordered words : " + strSet);

        System.out.println("4. Remove repeated names from a class list.");
        String[] names = {"Ronit", "Shubham", "Kartik", "Ronit", "Shubham"};
        strSet = new LinkedHashSet<>();
        Collections.addAll(strSet, names);
        System.out.println("List After Removing " + strSet);

        System.out.println("5. Merge two lists preserving order.");
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9};
        set = new LinkedHashSet<>();
        Collections.addAll(set,arr1);
        Collections.addAll(set,arr2);
        System.out.println("Lists After Merging : "+ set);

        System.out.println("6. Store browser history without duplicates.");
        LinkedHashSet<String> history = new LinkedHashSet<>();
        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        history.add("google.com");
        history.add("chatgpt.com");
        System.out.println("Browser History: " + history);


        System.out.println("7. Find unique elements from array in original order.");
        set = new LinkedHashSet<>();
        arr = new int[]{10, 10, 20, 30, 40, 40, 30};
        for (int i : arr){
            set.add(i);
        }
        System.out.println("Array After Removing Duplicates: "+set);

        System.out.println("9. Build recent search history feature.");
        LinkedHashSet<String> searchHistory = new LinkedHashSet<>();

        String search = "Java";
        searchHistory.remove(search);
        searchHistory.add(search);

        search = "Spring Boot";
        searchHistory.remove(search);
        searchHistory.add(search);

        search = "PostgreSQL";
        searchHistory.remove(search);
        searchHistory.add(search);

        search = "Java"; // searched again
        searchHistory.remove(search);
        searchHistory.add(search);

        System.out.println(searchHistory);
    }
}
